package com.example.main;

import com.example.greeters.Greeter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {

    @Autowired
    private Greeter greeter;

    @Override
    public void run(String... args) {
       greeter.greet();
    }

    @Bean
    public Greeter createGreeter() {
        return new Greeter();
    }
}
