package com.example.sequence;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SeqApp {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(MultiConfig.class);
        MultiBean multiBeanService = ctx.getBean(MultiBean.class);

        multiBeanService.testMulti();

    }
}
