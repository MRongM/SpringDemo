package com.example.autowire;

import com.example.dao.OrderDao;
import com.example.dao.UserDao;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class AutoApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("AutoBeans.xml");
		UserController userController = context.getBean("userController", UserController.class);
		userController.doStr();
	}

}
