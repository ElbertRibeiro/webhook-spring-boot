package com.elbertribeiro.alerta;

public class Alerta {
    private String url;
    private String statusEnvio;

    public Alerta(String url, String statusEnvio) {
        this.url = url;
        this.statusEnvio = statusEnvio;
    }

    public String getUrl() {
        return url;
    }

    public String getStatusEnvio() {
        return statusEnvio;
    }
}
