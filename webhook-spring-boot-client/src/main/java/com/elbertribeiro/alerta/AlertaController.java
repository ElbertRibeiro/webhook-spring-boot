package com.elbertribeiro.alerta;

import com.elbertribeiro.dto.ProtocoloDto;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping("notificacao")
@Log4j2
public class AlertaController {

    @PostMapping
    public ResponseEntity<String> getAlerta(@RequestBody ProtocoloDto protocoloDto) {
        log.info(protocoloDto);
        return ok("Evento recebido");
    }
}
