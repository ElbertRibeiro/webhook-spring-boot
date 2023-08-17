package com.example.demo.controller;

import com.example.demo.dto.Post;
import com.example.demo.service.WebhookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/posts")
public class PostController {
    @Autowired
    WebhookService webhookService;

    @PostMapping
    public ResponseEntity<String> createPost(@RequestBody Post post) {
        webhookService.notifyNewPost(post);
        return ResponseEntity.status(HttpStatus.CREATED).body("Postagem criada com sucesso");
    }
}
