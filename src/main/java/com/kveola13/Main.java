package com.kveola13;

import com.kveola13.pojo.Unit;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Unit.xml");
        Unit unit1 = (Unit) context.getBean("unit1");
        Unit unit2 = context.getBean("unit1", Unit.class);

        System.out.printf("unit1: %s, unit 2: %s\n", unit1.toString(), unit2.toString());
    }
}
