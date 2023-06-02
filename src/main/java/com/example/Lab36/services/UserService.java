package com.example.Lab36.services;

import com.example.Lab36.entity.User;
import com.example.Lab36.reponsitory.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private IUserRepository userRepository;
    public void save(User user) {
        userRepository.save(user);
    }
}