package com.example.Tourist.hooks;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class SitesIndexer {

/*
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
*/
}