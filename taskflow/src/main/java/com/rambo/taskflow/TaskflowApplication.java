package com.rambo.taskflow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

//@SpringBootApplication
public class TaskflowApplication {

	void bar(){
		System.out.println("bar");
	}
	void jojo(String na){
		System.out.println("jojo");
	}

	void cc(){
		HashMap< String, MI> fooMap = new HashMap<String, MI>();
		fooMap.put("1", this::bar);
		fooMap.put("2", this::jojo);
		System.out.println(fooMap);
	}

	public static void main(String[] args) {
		new TaskflowApplication().cc();
//		SpringApplication.run(TaskflowApplication.class, args);

	}

}
