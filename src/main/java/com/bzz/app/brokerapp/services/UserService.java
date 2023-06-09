package com.bzz.app.brokerapp.services;

import com.bzz.app.brokerapp.Entities.User;
import com.bzz.app.brokerapp.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    public final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public List<User> getUser(){
        return userRepository.findAll();
    }

    public void addNewUser(User user) {
        Optional<User> userOptional = userRepository
                .findUserByUsername(user.getUsername());
        if (userOptional.isPresent()){
            throw new IllegalStateException("Username is already given");

        }
        userRepository.save(user);
    }
}
