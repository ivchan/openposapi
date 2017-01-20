package com.opencloud.openposapi.services;

import com.opencloud.openposapi.entities.User;
import com.opencloud.openposapi.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * Created by ivanchan on 20/1/2017.
 */

@Service
public class UserServiceImp implements UserService {
    @Autowired
    private UserRepository userRepository;

    public UserServiceImp() {
    }

    @Override
    public User getUser(UUID userKey) {
        return this.userRepository.findOne(userKey);
    }

    @Override
    public List<User> listUsers() {
        return this.userRepository.findAll();
    }

    @Override
    public User addUser(User user) {
        return this.userRepository.save(user);
    }

    @Override
    public User updateUser(UUID userKey, User user) {
        return this.userRepository.save(user);
    }

    @Override
    public void deleteUser(UUID userKey) {
        if (this.userRepository.findOne(userKey) != null) {
            this.userRepository.delete(userKey);
        }
    }
}
