package com.kamal.hatchwayassessment.controller;

import com.kamal.hatchwayassessment.client.ApiClient;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(value = "/api/v1")
@RequiredArgsConstructor
public class ApiController {

    private final ApiClient apiClient;

    @GetMapping(value = "/posts")
    public ResponseEntity readAirlineData (@RequestParam(value="tags", required = true) String tags,
                                           @RequestParam(defaultValue = "id", value="sortBy", required = false) String sort,
                                           @RequestParam(defaultValue = "asc", value="direction", required = false) String direction) {

        return ResponseEntity.ok(apiClient.readPostsByTag(tags));
    }

}