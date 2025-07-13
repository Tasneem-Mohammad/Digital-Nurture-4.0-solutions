package com.example.springBasics.controller;

import com.example.springBasics.entity.JwtRequest;
import com.example.springBasics.entity.JwtResponse;
import com.example.springBasics.util.JwtUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class JwtAuthenticationController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private UserDetailsService userDetailsService;

    @PostMapping("/authenticate")
    public JwtResponse createAuthenticationToken(@RequestBody JwtRequest jwtRequest) throws Exception {
    	
    	System.out.println("Received login request: " + jwtRequest.getUsername());

        try {
            // Perform authentication
            authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                    jwtRequest.getUsername(), 
                    jwtRequest.getPassword()
                )
            );
        } catch (AuthenticationException e) {
            System.out.println("Authentication failed: " + e.getMessage());
            throw new Exception("Invalid credentials", e);
        }


        // If authentication is successful, generate token
        final UserDetails userDetails = userDetailsService.loadUserByUsername(jwtRequest.getUsername());
        final String token = jwtUtil.generateToken(userDetails);

        return new JwtResponse(token);
    }
}
