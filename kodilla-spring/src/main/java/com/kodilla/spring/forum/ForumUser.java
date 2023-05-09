package com.kodilla.spring.forum;

import org.springframework.stereotype.Component;

@Component
public class ForumUser {
    String username;

    public ForumUser() {
        this.username = "Will Smith";
    }

    public String getUsername() {
        return username;
    }
}
