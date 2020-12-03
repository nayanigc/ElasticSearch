package com.example.Tourist.remote;

import com.example.Tourist.models.es.EsSite;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "site", url = "http://arest.me")
public interface SiteClient {

    @GetMapping("/api/sites")
    List<EsSite>  getSites();
}