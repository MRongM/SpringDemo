package com.example.autowire;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService{
    @Resource
    private UserDao userDao;
    public UserDao getUserDao() {
        return userDao;
    }
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    @Override
    public void out() {
        userDao.print();
        System.out.println("2 UserServiceImpl");
    }
}
