package com.sprinbootcode.controller;

import com.sprinbootcode.dto.TokenDto;
import com.sprinbootcode.service.UserService;
import com.sprinbootcode.utility.JwtUtility;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/api/auth")
@AllArgsConstructor
public class AuthController {
    private final UserService userService;
    private final JwtUtility jwtUtility;
    @PostMapping("/login")
    public TokenDto login(Principal principal) {
        String username = principal.getName();

        String token = jwtUtility.generateToken(username);
        return new TokenDto(username, token);
    }
}
