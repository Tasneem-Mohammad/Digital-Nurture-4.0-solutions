package com.example.springBasics.service;

import org.springframework.context.annotation.Lazy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MyUserDetailsService implements UserDetailsService {

	private final PasswordEncoder passwordEncoder;

	public MyUserDetailsService(@Lazy PasswordEncoder passwordEncoder) {
	    this.passwordEncoder = passwordEncoder;
	}


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if (username.equals("admin")) {
            return new User(
                "admin",
                passwordEncoder.encode("password"), // uses NoOp encoder
                new ArrayList<>()
            );
        }
        throw new UsernameNotFoundException("User not found: " + username);
    }
}
