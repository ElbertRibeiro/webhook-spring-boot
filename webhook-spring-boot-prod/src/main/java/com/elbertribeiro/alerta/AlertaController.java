package com.elbertribeiro.alerta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("alerta")
public class AlertaController {
    @Autowired
    AlertaService alertaService;

    @GetMapping
    public String getAlerta() {
        alertaService.enviaAlerta();
        return "Alerta Enviado";
    }
}
