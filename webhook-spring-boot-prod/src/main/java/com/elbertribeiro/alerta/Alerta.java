package com.elbertribeiro.alerta;

public class Alerta {
    private String url;
    private String erro;

    public Alerta(String url, String erro) {
        this.url = url;
        this.erro = erro;
    }

    public String getUrl() {
        return url;
    }

    public String getErro() {
        return erro;
    }
}
