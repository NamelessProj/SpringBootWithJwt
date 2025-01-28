package com.nameless.jwtTest.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/test")
public class TestController {

    @GetMapping
    public String testPublic() {
        return "Hello World";
    }

    @GetMapping("/user")
    @PreAuthorize("hasRole('USER') or " + // Require USER, MODERATOR, or ADMIN role
            "hasRole('MODERATOR') or " +
            "hasRole('ADMIN')")
    public String testUser() {
        return "Hello User";
    }
}