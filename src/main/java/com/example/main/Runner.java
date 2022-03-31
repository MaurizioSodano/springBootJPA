package com.example.main;

import com.example.entities.User;
import com.example.greeters.Greeter;
import com.example.repositories.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {

    @Autowired
    private UserDao userDao;

    @Override
    public void run(String... args) {
        var user1=new User("Neptune","neptune@example.com");

        userDao.save(user1);
    }


}
