package com.kveola13;

import com.kveola13.pojo.Unit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
        Unit unit = context.getBean(Unit.class);
        System.out.println(unit.init());
    }
}
