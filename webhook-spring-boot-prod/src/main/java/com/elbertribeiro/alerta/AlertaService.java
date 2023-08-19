package com.elbertribeiro.alerta;

import com.elbertribeiro.comum.WebHookHttpClient;
import com.elbertribeiro.webhook.WebhookService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class AlertaService {
    @Autowired
    WebhookService webhookService;

    @Autowired
    WebHookHttpClient webHookHttpClient;

    public void enviaAlerta() {
        webhookService.findAll().forEach(webhook -> {
            try {
                webHookHttpClient.get(webhook.getUrl(), String.class);
            } catch (Exception e) {
                log.error("Erro ao fazer a requisição para: " + webhook.getUrl(), e);
            }
        });
    }
}
