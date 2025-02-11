package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @GetMapping ("/public")
    public String publicEndpoint() {
        return "public page anyone can to see";
    }

    @GetMapping ("/private")
    public String privateEndpoint() {
        return "private page only logged user can to see";
    }

    @GetMapping("/admin")
    public String adminEndpoint() {
        return "Página para administradores.";
    }

    @GetMapping("/user")
    public String userEndpoint() {
        return "Página para usuarios.";
    }

}
