package org.example;

import org.example.beens.Bean1;
import org.example.beens.Bean2;
import org.example.config.BeanConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        Bean1 bean1 = context.getBean(Bean1.class);
        Bean2 bean2 = context.getBean(Bean2.class);

        System.out.println(bean1.getName() + " is working in " + bean2.getCompanyName());
    }
}
