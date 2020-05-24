package com.kveola13;

import com.kveola13.pojo.Unit;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Unit.xml");
        Unit unit1 = (Unit) context.getBean("unit1");
        Unit unit2 = context.getBean("unit1", Unit.class);

        System.out.printf("unit1: %s, unit 2: %s\n", unit1.toString(), unit2.toString());

        Resource resource = new ClassPathResource("Unit.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource);
        Unit unit3 = (Unit) beanFactory.getBean("unit1");
        Unit unit4 = beanFactory.getBean("unit2", Unit.class);

        System.out.printf("unit3: %s, unit4: %s\n", unit3.toString(), unit4.toString());
    }
}
