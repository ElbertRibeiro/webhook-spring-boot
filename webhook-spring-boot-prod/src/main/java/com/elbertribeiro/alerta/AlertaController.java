package com.elbertribeiro.alerta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping("alerta")
public class AlertaController {
    @Autowired
    AlertaService alertaService;

    @GetMapping
    public ResponseEntity<AlertaDto> getAlerta() {
        return ok(alertaService.enviaAlerta());
    }
}
