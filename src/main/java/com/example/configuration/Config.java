package com.example.configuration;

import com.example.greeters.Greeter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public Greeter configureGreeter(){
        return new Greeter();
    }
}
