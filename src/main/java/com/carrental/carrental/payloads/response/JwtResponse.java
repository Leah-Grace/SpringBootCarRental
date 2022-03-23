package com.carrental.carrental.payloads.response;

import java.util.List;

public class JwtResponse {
    private String token;
    private Long id;
    private String username;
    private List<String> roles;

    public JwtResponse(String token, Long id, String username, List<String> roles) {
        this.token = token;
        this.id = id; // todo: future update - remove for security purposes. Front-end does not need the info and it could picked up by malicious psn
        this.username = username;
        this.roles = roles;
    }

    public String getToken() {
        return token;
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public List<String> getRoles() {
        return roles;
    }
}
