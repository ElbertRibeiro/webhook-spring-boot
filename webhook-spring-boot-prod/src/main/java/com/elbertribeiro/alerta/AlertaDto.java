package com.elbertribeiro.alerta;

import java.util.List;

public class AlertaDto {
    public List<Alerta> appsNotificados;
    public List<Alerta> appsNaoNotificados;

    public List<Alerta> getAppsNotificados() {
        return appsNotificados;
    }

    public void setAppsNotificados(List<Alerta> appsNotificados) {
        this.appsNotificados = appsNotificados;
    }

    public List<Alerta> getAppsNaoNotificados() {
        return appsNaoNotificados;
    }

    public void setAppsNaoNotificados(List<Alerta> appsNaoNotificados) {
        this.appsNaoNotificados = appsNaoNotificados;
    }
}
