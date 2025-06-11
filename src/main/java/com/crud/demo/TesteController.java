package com.crud.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TesteController {

    @GetMapping("/hello")
    public String dizerOla() {
        return "API rodando!";
    }
}