package com.example.Tourist.hooks;

import com.example.Tourist.models.es.EsSite;
import com.example.Tourist.remote.SiteClient;
import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.elasticsearch.action.admin.indices.delete.DeleteIndexRequest;
import org.elasticsearch.action.bulk.BulkRequest;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.client.indices.GetIndexRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

import static org.elasticsearch.common.xcontent.XContentType.JSON;

@Component
@Slf4j
public class SitesIndexer {


    private static final Logger LOGGER = LoggerFactory.getLogger(SitesIndexer.class);

    private static final String SITES_INDEX = "sites";
    private static final String SITES_INDEX_ALIAS = "sites";

    @Autowired
    private RestHighLevelClient restHighLevelClient;

    private SiteClient siteClient;

    @Autowired
    private Gson gson;


    @Scheduled(fixedDelay = 86400000, initialDelay = 5000)
    public void reindex() throws IOException {
        LOGGER.info("start reindexing again...");
        List<EsSite> uniscoSites = siteClient.getSites();


        // delete index if it exists
        boolean indexExist = restHighLevelClient.indices().exists(new GetIndexRequest(SITES_INDEX), RequestOptions.DEFAULT);

        if(indexExist) {
            DeleteIndexRequest deleteIndex = new DeleteIndexRequest(SITES_INDEX);
            restHighLevelClient.indices().delete(deleteIndex, RequestOptions.DEFAULT);
        }

        BulkRequest bulkRequest = new BulkRequest();
        uniscoSites.forEach(site -> {
            IndexRequest indexRequest = new IndexRequest(SITES_INDEX)
                    .source(gson.toJson(site), JSON);

            bulkRequest.add(indexRequest);
        });
        restHighLevelClient.bulk(bulkRequest, RequestOptions.DEFAULT);

        LOGGER.info("end reindexing...");

    }

}