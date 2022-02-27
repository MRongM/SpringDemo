package com.example.demo;

import com.example.dao.UserDao;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class AopDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("DemoBeans.xml");
		//获取代理对象
		UserDao userDao = context.getBean("userDaoProxy", UserDao.class);
		//调用 UserDao 中的各个方法
		userDao.add();
		userDao.delete();
		userDao.get();
		userDao.modify();
//		ApplicationContext context = new ClassPathXmlApplicationContext("HelloBeans.xml");
//		HelloWorld obj = context.getBean("helloWorld",HelloWorld.class);
//		obj.getMessage();
	}

}
