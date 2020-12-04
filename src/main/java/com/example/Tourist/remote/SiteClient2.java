package com.example.Tourist.remote;

import com.example.Tourist.models.es.EsAccount;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
@FeignClient(name = "account")
public interface SiteClient2 {
    @RequestMapping(method = RequestMethod.GET, value = "/api/accounts")
    List<EsAccount>  getAccount();
}
