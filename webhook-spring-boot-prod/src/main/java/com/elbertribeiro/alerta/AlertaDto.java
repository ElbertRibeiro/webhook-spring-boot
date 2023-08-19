package com.elbertribeiro.alerta;

import java.util.List;

public class AlertaDto {
    public List<Alerta> appsNotificados;
    public List<Alerta> appsNaoNotificados;

    public AlertaDto(List<Alerta> appsNotificados, List<Alerta> appsNaoNotificados) {
        this.appsNotificados = appsNotificados;
        this.appsNaoNotificados = appsNaoNotificados;
    }

    public List<Alerta> getAppsNotificados() {
        return appsNotificados;
    }

    public List<Alerta> getAppsNaoNotificados() {
        return appsNaoNotificados;
    }
}
