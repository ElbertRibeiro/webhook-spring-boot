package com.elbertribeiro.webhook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WebhookController {

    private final WebhookService webhookService;

    public WebhookController(WebhookService webhookService) {
        this.webhookService = webhookService;
    }

    @GetMapping("/docs")
    public String doc(Webhook webhook) {
        webhookService.save(webhook);
        return "redirect:/";
    }

    @GetMapping("list")
    public String listWebhooks(Model model) {
        model.addAttribute("webhooks", webhookService.findAll());
        return "list";
    }

    @GetMapping("/new")
    public String newWebhookForm() {
        return "new";
    }

    @PostMapping("/webhooks")
    public String createWebhook(Webhook webhook) {
        webhookService.save(webhook);
        return "redirect:/list";
    }
}

