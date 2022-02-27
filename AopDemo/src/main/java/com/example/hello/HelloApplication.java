package com.example.hello;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class HelloApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("HelloBeans.xml");
		HelloWorld obj = context.getBean("helloWorld",HelloWorld.class);
		obj.getMessage();
	}

}
