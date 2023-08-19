package com.elbertribeiro.alerta;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("notificacao")
@Log4j2
public class AlertaController {

    @GetMapping
    public String getAlerta() {
        log.info("Teste logger");
        return "alerta";
    }
}
