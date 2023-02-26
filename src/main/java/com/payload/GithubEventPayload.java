package com.payload;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;

public class GithubEventPayload {
    
    private String action;
    private GithubRepo repository;

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public GithubRepo getRepository() {
        return repository;
    }

    public void setRepository(GithubRepo repository) {
        this.repository = repository;
    }

    public static GithubEventPayload fromJson(String json) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(json, GithubEventPayload.class);
    }
}


