package com.loose.coupling;

import car.example.bean.MyBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class NewDatabaseProvider implements UserDataProvider{

    @Override
    public String getUserDetails() {
        return "New Database in action";
    }
}
