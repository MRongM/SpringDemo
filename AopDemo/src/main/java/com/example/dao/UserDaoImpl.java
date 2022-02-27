package com.example.dao;

public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("UserDao execute add");
    }

    @Override
    public void delete() {
        System.out.println("UserDao execute delete");
    }

    @Override
    public void modify() {
        System.out.println("UserDao execute modify");
    }

    @Override
    public void get() {
        System.out.println("UserDao execute get");
    }
}
