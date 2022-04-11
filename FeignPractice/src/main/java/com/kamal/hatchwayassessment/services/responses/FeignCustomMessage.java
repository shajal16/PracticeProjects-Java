package com.kamal.hatchwayassessment.services.responses;

import lombok.Data;

@Data
public class FeignCustomMessage {
    private String timestamp;
    private int status;
    private String error;
    private String message;
    private String path;
}