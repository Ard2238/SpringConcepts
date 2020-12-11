package com.spring.springconcepts;

import com.spring.springconcepts.component.DemoBean;
import com.spring.springconcepts.component.EmployeeBean;
import com.spring.springconcepts.controller.HelloRestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringConceptsApplication {
    public static final Logger logger = LoggerFactory.getLogger(SpringConceptsApplication.class);

    public static void main(String[] args) {
        logger.debug("Welcome to the Spring Concepts");
        ApplicationContext context = SpringApplication.run(SpringConceptsApplication.class, args);
        logger.info("Checking Context : " + context.getBean(DemoBean.class));

        logger.debug("@Autowire example:  ");
        EmployeeBean employeeBean = context.getBean(EmployeeBean.class);
        employeeBean.setEid(101);
        employeeBean.setName("Abhishek");
        employeeBean.showEmployeeDetails();
    }
}
