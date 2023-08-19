package com.elbertribeiro.alerta;

import com.elbertribeiro.comum.WebHookHttpClient;
import com.elbertribeiro.webhook.WebhookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlertaService {
    @Autowired
    WebhookService webhookService;

    @Autowired
    WebHookHttpClient webHookHttpClient;
    public void enviaAlerta(){
        webhookService.findAll().forEach(webhook -> {
            webHookHttpClient.get(webhook.getUrl(), String.class);
        });
    }
}
