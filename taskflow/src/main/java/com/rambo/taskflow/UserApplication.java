package com.rambo.taskflow;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class UserApplication {

	public static void main(String[] args) {
		ApplicationContext context2 = new ClassPathXmlApplicationContext("Beans.xml");
		UserService userService = context2.getBean("userService", UserService.class);
		User user = new User();
		user.setUserName("小张");
		user.setStatus("离线线");
		//新增一个用户
		int i = userService.addUser(user);
		System.out.println("新增用户成功！");
		User user1 = new User();
		user1.setUserName("小张");
		user1.setStatus("在线");
		int u = userService.updateUser(user1);
		System.out.println("修改用户成功");
		List<Object[]> batchArgs = new ArrayList<>();
		Object[] o1 = {"小明", "在线"};
		Object[] o2 = {"小龙", "离线"};
		Object[] o3 = {"小林", "在线"};
		Object[] o4 = {"小李", "在线"};
		batchArgs.add(o1);
		batchArgs.add(o2);
		batchArgs.add(o3);
		batchArgs.add(o4);
		userService.batchAddUser(batchArgs);
		System.out.println("批量增加完毕");
		User user2 = new User();
		user2.setStatus("在线");
		int i1 = userService.countUser(user2);
		System.out.println("在线用户的个数为：" + i1);
		List<User> userList = userService.getUserList(user2);
		System.out.println("在线用户列表查询成功！");
		for (User user4 : userList) {
			System.out.println("用户 ID:" + user4.getUserId() + "，用户名：" + user4.getUserName() + "，状态：" + user4.getStatus());
		}
		//SpringApplication.run(TaskflowApplication.class, args);

	}

}
