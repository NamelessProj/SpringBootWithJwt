package com.nameless.jwtTest.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/test")
public class TestController {

    @GetMapping("/public")
    public String testPublic() {
        return "Hello World";
    }

    @GetMapping("/user")
    public String testUser() {
        return "Hello User";
    }
}