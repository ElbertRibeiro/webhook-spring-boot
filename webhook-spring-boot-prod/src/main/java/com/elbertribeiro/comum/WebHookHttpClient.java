package com.elbertribeiro.comum;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class WebHookHttpClient {
    private final RestTemplate restTemplate;

    public WebHookHttpClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public <T> T get(String path, Class<T> responseType) {
        ResponseEntity<T> response = restTemplate
                .exchange(path, HttpMethod.GET, null, responseType);
        return response.getBody();
    }

    public <T> T post(String path, Object request, Class<T> responseType) {
        ResponseEntity<T> response = restTemplate
                .exchange(path, HttpMethod.POST, (HttpEntity<?>) request, responseType);
        return response.getBody();
    }
}
