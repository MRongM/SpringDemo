package com.example.autowire;

import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class UserController {
    @Resource
    private UserService userService;
    public UserService getUserService() {
        return userService;
    }
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
    public void doStr() {
        userService.out();
        System.out.println("3 UserController");
    }
}
