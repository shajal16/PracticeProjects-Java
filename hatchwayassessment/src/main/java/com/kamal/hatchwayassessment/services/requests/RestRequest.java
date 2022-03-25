package com.kamal.hatchwayassessment.services.requests;

import lombok.Data;

import java.util.List;

@Data
public class RestRequest {
    private List<PostData> posts;
}
