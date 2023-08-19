package com.elbertribeiro.alerta;

import com.elbertribeiro.comum.WebHookHttpClient;
import com.elbertribeiro.webhook.WebhookService;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class AlertaService {
    private final WebhookService webhookService;
    private final WebHookHttpClient webHookHttpClient;

    public AlertaService(WebhookService webhookService, WebHookHttpClient webHookHttpClient) {
        this.webhookService = webhookService;
        this.webHookHttpClient = webHookHttpClient;
    }

    public AlertaDto enviaAlerta() {
        List<Alerta> appsNotificados = webhookService.findAll()
                .stream()
                .map(webhook -> {
                    try {
                        webHookHttpClient.get(webhook.getUrl(), String.class);
                        return new Alerta(webhook.getUrl(), "OK");
                    } catch (HttpClientErrorException e) {
                        return new Alerta(webhook.getUrl(), e.getStatusCode().toString());
                    }
                })
                .collect(Collectors.toList());

        List<Alerta> appsNaoNotificados = appsNotificados.stream()
                .filter(alerta -> !Objects.equals(alerta.getStatusEnvio(), "OK"))
                .collect(Collectors.toList());

        List<Alerta> appsNotificadosComSucesso = appsNotificados.stream()
                .filter(alerta -> Objects.equals(alerta.getStatusEnvio(), "OK"))
                .collect(Collectors.toList());
        return new AlertaDto(appsNotificadosComSucesso, appsNaoNotificados);
    }
}
