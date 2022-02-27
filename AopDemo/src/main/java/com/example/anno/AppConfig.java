package com.example.anno;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"com.example.dao", "com.example.advice", }) //注解扫描
@EnableAspectJAutoProxy //开启 AspectJ 的自动代理
public class AppConfig {
}