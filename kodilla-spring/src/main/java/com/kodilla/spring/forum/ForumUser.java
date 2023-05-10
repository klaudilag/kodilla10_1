package com.kodilla.spring.forum;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@Component
@SpringBootApplication
public class ForumUser {
    String username;

    public ForumUser() {
        this.username = "Will Smith";
    }

    public String getUsername() {
        return username;
    }
}
