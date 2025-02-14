package org.example;

import org.example.beens.Been1;
import org.example.config.Bean1Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Bean1Config.class);
        Been1 been1 = context.getBean(Been1.class);
        System.out.println(been1.getName());
    }
}