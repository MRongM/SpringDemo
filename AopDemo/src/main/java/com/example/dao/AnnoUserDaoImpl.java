package com.example.dao;

import org.springframework.stereotype.Component;

@Component("annoUserDao")
public class AnnoUserDaoImpl implements AnnoUserDao {
    @Override
    public void add() {
        System.out.println("AnnoUserDaoImpl 正在执行 add ...");
    }

    @Override
    public void delete() {
        System.out.println("AnnoUserDaoImpl 正在执行 delete ...");
    }

    @Override
    public int modify() {
        System.out.println("AnnoUserDaoImpl 正在执行 modify ...");
        return 1;
    }

    @Override
    public void get() {
        System.out.println("AnnoUserDaoImpl 正在执行 get ...");
    }
}
