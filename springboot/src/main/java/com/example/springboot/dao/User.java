package com.example.springboot.dao;

import java.util.List;

public interface User {
    void addUser(User user);
    void delUser(Integer id);
    List<User> findAll();
}
