package com.example.proxy;

import com.example.dao.OrderDao;
import com.example.dao.UserDao;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class ProxyApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ProxyBeans.xml");
		//获取代理对象
		UserDao userDao = context.getBean("userDao", UserDao.class);
		//获取代理对象
		OrderDao orderDao = context.getBean("orderDao", OrderDao.class);
		//调用 UserDao 中的各个方法
		userDao.add();
		userDao.delete();
		userDao.modify();
		userDao.get();
		//调用 OrderDao 中的各个方法
		orderDao.add();
		orderDao.adds();
		orderDao.delete();
		orderDao.get();
		orderDao.modify();
	}

}
