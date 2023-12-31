package com.elbertribeiro.webhook;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WebhookService {
    private final WebhookRepository webhookRepository;

    public WebhookService(WebhookRepository webhookRepository) {
        this.webhookRepository = webhookRepository;
    }

    public List<Webhook> findAll() {
        return webhookRepository.findAll();
    }

    public void save(Webhook webhook) {
        webhookRepository.save(webhook);
    }
}

