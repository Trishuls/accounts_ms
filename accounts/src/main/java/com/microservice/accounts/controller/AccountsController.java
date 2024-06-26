package com.microservice.accounts.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/accounts")
public class AccountsController {

    @GetMapping("/getName")
    public String getName() {
        return "Trishul";
    }
}
