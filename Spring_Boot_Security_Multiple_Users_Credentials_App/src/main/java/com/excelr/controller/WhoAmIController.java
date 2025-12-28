package com.excelr.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WhoAmIController {

    @GetMapping("/whoami")
    public String whoami(Principal principal) {
        if (principal == null) {
            return "NOT AUTHENTICATED";
        }
        return "Authenticated as: " + principal.getName();
    }
}
