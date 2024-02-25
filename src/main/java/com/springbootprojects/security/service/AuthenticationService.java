package com.springbootprojects.security.service;


import com.springbootprojects.security.dao.request.SignUpRequest;
import com.springbootprojects.security.dao.request.SigninRequest;
import com.springbootprojects.security.dao.response.JwtAuthenticationResponse;

public interface AuthenticationService {
    JwtAuthenticationResponse signup(SignUpRequest request);

    JwtAuthenticationResponse signin(SigninRequest request);
}
