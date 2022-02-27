package com.example.anno;

import com.example.dao.AnnoUserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnoApp {
    public static void main(String[] args) {
        ApplicationContext context2 = new AnnotationConfigApplicationContext(AppConfig.class);
        AnnoUserDao annoUserDao = context2.getBean("annoUserDao", AnnoUserDao.class);
        annoUserDao.add();
        annoUserDao.modify();
        annoUserDao.delete();
        annoUserDao.get();
    }
}
