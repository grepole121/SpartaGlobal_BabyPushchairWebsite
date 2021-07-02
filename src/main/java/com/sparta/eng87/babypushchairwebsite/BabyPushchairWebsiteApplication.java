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


    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
    @Bean
    public CommandLineRunner demo(UserService userService){
        return (args) -> {
           // userService.addUser(new UserEntity("employee", encoder.encode("password"), "ADMIN",1));
           // userService.addUser(new UserEntity("manish", encoder.encode("password"), "USER",1));
        };
    }
    public static void main(String[] args) {


        SpringApplication.run(BabyPushchairWebsiteApplication.class, args);
    }


}
