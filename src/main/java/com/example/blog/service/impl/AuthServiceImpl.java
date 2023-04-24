package com.example.blog.service.impl;

import com.example.blog.payload.LoginDto;
import com.example.blog.service.AuthService;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {
    private AuthenticationManager authenticationManager;

    public AuthServiceImpl(AuthenticationManager authenticationManager) {
        this.authenticationManager = authenticationManager;
    }

    @Override
    public String login(LoginDto loginDto) {
        UsernamePasswordAuthenticationToken token
                = new UsernamePasswordAuthenticationToken(
                        loginDto.getUsernameOrEmail(),
                loginDto.getPassword()
        );
        Authentication authentication = authenticationManager.authenticate(token);
        SecurityContextHolder.getContext().setAuthentication(authentication);

        return "user logged in successfully";
    }
}
