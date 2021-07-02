package com.sparta.eng87.babypushchairwebsite;

import com.sparta.eng87.babypushchairwebsite.entity.UserEntity;
import com.sparta.eng87.babypushchairwebsite.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class BabyPushchairWebsiteApplication {


    public static void main(String[] args) {


        SpringApplication.run(BabyPushchairWebsiteApplication.class, args);
    }



}
