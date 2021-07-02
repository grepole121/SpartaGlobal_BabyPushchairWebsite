package com.sparta.eng87.babypushchairwebsite.service;


import com.sparta.eng87.babypushchairwebsite.entity.UserEntity;
import com.sparta.eng87.babypushchairwebsite.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void addUser(UserEntity userEntity){
        userRepository.save(userEntity);
    }

}
