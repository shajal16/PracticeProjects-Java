package com.kamal.hatchwayassessment.client;

import com.kamal.hatchwayassessment.config.CustomFeignConfig;
import com.kamal.hatchwayassessment.services.responses.RestResponse;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "${app.feign.config.name}", url = "${app.feign.config.url}", configuration = CustomFeignConfig.class)
public interface ApiClient {

    @RequestMapping(method = RequestMethod.GET, value = "/posts")
    RestResponse readPostsByTag(@RequestParam("tag") String tag);


}