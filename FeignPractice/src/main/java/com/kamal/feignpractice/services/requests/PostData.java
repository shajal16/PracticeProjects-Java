package com.kamal.feignpractice.services.requests;

import lombok.Data;

import java.util.List;

@Data
public class PostData {
    private String id;
    private String author;
    private String authorId;
    private String likes;
    private String popularity;
    private String reads;
    private List<String> tags;
}
