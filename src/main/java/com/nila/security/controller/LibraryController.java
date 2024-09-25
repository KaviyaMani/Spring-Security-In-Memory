package com.nila.security.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryController {

    @GetMapping("/")
    public String getName() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return "Welcome to Nila library "+authentication.getName();
    }

    @GetMapping("/1")
    public String getName1(Authentication authentication) {
        return "Welcome to Nila library "+authentication.getName();
    }
}
