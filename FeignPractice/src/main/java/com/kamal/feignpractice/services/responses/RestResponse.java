package com.kamal.feignpractice.services.responses;

import lombok.Data;

import java.util.List;

@Data
public class RestResponse {
    private List<PostData> posts;
    private int status;
}