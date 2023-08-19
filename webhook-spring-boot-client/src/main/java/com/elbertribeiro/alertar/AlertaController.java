package com.elbertribeiro.alertar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("alerta")
public class AlertaController {

    @GetMapping
    public String getAlerta(){
        return "alerta";
    }
}
