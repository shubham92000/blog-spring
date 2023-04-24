package com.example.blog.service;

import com.example.blog.payload.LoginDto;

public interface AuthService {
    String login(LoginDto loginDto);
}
