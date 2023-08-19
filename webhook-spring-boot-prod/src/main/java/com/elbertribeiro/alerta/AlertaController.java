package com.elbertribeiro.alerta;

import com.elbertribeiro.dto.ProtocoloDto;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping("alerta")
@Log4j2
public class AlertaController {
    private final AlertaService alertaService;

    public AlertaController(AlertaService alertaService) {
        this.alertaService = alertaService;
    }

    @PostMapping
    public ResponseEntity<AlertaDto> getAlerta(@RequestBody ProtocoloDto protocoloDto) {
        log.info(protocoloDto);
        return ok(alertaService.enviaAlerta());
    }
}
