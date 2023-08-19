package com.example.webhook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller(/*"/webhooks"*/)
public class WebhookController {

    /*@Autowired WebhookService webhookService;

    @GetMapping
    public String listWebhooks(Model model) {
        model.addAttribute("webhooks", webhookService.findAll());
        return "webhooks/list";
    }*/

    @GetMapping("/new")
    public String newWebhookForm() {
        return "new";
    }

/*    @PostMapping
    public String createWebhook(Webhook webhook) {
        webhookService.save(webhook);
        return "redirect:/webhooks";
    }*/
}

