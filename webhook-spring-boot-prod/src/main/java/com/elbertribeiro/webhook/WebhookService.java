package com.elbertribeiro.webhook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WebhookService {
    @Autowired
    WebhookRepository webhookRepository;

    public List<Webhook> findAll() {
        return webhookRepository.findAll();
    }

    public void save(Webhook webhook) {
        webhookRepository.save(webhook);
    }
}

