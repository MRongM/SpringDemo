package com.example.order;

import com.example.dao.OrderDao;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class OrderApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("OrderBeans.xml");
		OrderDao orderDao = context.getBean("orderDaoProxy", OrderDao.class);
		//调用 OrderDao 中的各个方法
		orderDao.add();
		orderDao.adds();
		orderDao.delete();
		orderDao.get();
		orderDao.modify();
//		ApplicationContext context = new ClassPathXmlApplicationContext("HelloBeans.xml");
//		HelloWorld obj = context.getBean("helloWorld",HelloWorld.class);
//		obj.getMessage();
	}

}
