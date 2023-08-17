package com.example.demo.service;

import com.example.demo.dto.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WebhookService {
    @Autowired
    RestTemplate restTemplate;

    private static final String WEBHOOK_URL = "http://localhost:8080/webhook";

    public void notifyNewPost(Post post) {
        restTemplate.postForObject(WEBHOOK_URL, post, String.class);
    }
}

