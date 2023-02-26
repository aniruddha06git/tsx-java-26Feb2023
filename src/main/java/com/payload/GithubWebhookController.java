package com.payload;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class GithubWebhookController {
	
	@PostMapping("/webhook")
    public ResponseEntity<String> handleWebhook(@RequestBody String requestBody, HttpHeaders headers) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            GithubEventPayload payload = objectMapper.readValue(requestBody, GithubEventPayload.class);
            
            String eventType = headers.getFirst("X-GitHub-Event");
            String repositoryName = payload.getRepository().getName();
            String repositoryUrl = payload.getRepository().getUrl();
            
            System.out.println("Received event type: " + eventType);
            System.out.println("Repository name: " + repositoryName);
            System.out.println("Repository URL: " + repositoryUrl);
            
            return ResponseEntity.ok("Webhook received");
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().build();
        }
    }
}
