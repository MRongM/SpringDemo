package com.example.autowire;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao{
    @Override
    public void print() {
        System.out.println("1 UserDaoImpl...");
    }
}
