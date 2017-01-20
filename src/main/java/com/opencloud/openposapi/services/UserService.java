package com.opencloud.openposapi.services;

import com.opencloud.openposapi.entities.User;

import java.util.List;
import java.util.UUID;

/**
 * Created by ivanchan on 20/1/2017.
 */
public interface UserService {
    User getUser(UUID userKey);
    List<User> listUsers();
    User addUser(User user);
    User updateUser(UUID userKey, User user);
    void deleteUser(UUID userKey);
}
