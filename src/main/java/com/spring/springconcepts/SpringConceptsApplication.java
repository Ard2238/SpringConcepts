package com.spring.springconcepts;

import com.spring.springconcepts.component.DemoBean;
import com.spring.springconcepts.controller.HelloRestController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringConceptsApplication {

    public static void main(String[] args) {
        System.out.println("Welcome to the Spring Concepts");
        ApplicationContext context = SpringApplication.run(SpringConceptsApplication.class, args);
        System.out.println("Checking Context : " + context.getBean(DemoBean.class));
        System.out.println((context.getBean(HelloRestController.class)));
    }

}
