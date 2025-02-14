package org.example.config;
import org.example.beens.Been1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Bean1Config {
    @Bean
    Been1 bean1() {
        Been1 test = new Been1();
        test.setName("bean1");
        return test;
    }
}
