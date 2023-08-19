package com.elbertribeiro.alerta;

import com.elbertribeiro.comum.WebHookHttpClient;
import com.elbertribeiro.webhook.WebhookService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Log4j2
public class AlertaService {
    @Autowired
    WebhookService webhookService;

    @Autowired
    WebHookHttpClient webHookHttpClient;

    public AlertaDto enviaAlerta() {
        AlertaDto alertaDtos = new AlertaDto();
        webhookService.findAll().forEach(webhook -> {
            try {
                webHookHttpClient.get(webhook.getUrl(), String.class);
                Alerta alerta = new Alerta(webhook.getUrl());
                List<Alerta> alertas = new ArrayList<>();
                alertas.add(alerta);
                alertaDtos.setAppsNotificados(alertas);
            } catch (Exception e) {
                log.error("Erro ao fazer a requisição para: " + webhook.getUrl(), e);
                Alerta alerta = new Alerta(webhook.getUrl());
                List<Alerta> alertas = new ArrayList<>();
                alertas.add(alerta);
                alertaDtos.setAppsNaoNotificados(alertas);
            }
        });
        return alertaDtos;
    }
}
