package com.kodilla.spring.forum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.kodilla.spring.forum.ForumUser;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest
public class ForumTestSuite {
    @Test
    void testGetUsername(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        ForumUser user = context.getBean(ForumUser.class);
        String result = user.getUsername();
        Assertions.assertEquals(result,"Will Smith");
    }
}
