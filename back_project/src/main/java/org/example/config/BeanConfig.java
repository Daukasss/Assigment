package org.example.config;
import org.example.beens.Bean1;
import org.example.beens.Bean2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = "org.example")
@Configuration
public class BeanConfig {
    @Bean
    Bean1 bean1() {
        Bean1 test = new Bean1();
        test.setName("Daulet");
        return test;
    }
    @Bean
    Bean2 bean2() {
        Bean2 test2 = new Bean2(); //for repasitory 2
        test2.setCompanyName("Google");
        return test2;
    }
}
