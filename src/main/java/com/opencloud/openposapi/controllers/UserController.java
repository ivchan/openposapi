package com.opencloud.openposapi.controllers;

import com.opencloud.openposapi.entities.User;
import com.opencloud.openposapi.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

/**
 * Created by ivanchan on 20/1/2017.
 */

@RestController
public class UserController extends ApiController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public ResponseEntity<List<User>> listUser() {
        List<User> lstUsers = this.userService.listUsers();
        return new ResponseEntity<List<User>>(lstUsers, HttpStatus.OK);
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public ResponseEntity<User> getUser(@PathVariable("id")UUID userKey){
        User user = this.userService.getUser(userKey);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public ResponseEntity<User> addUser(@RequestBody User user) {
        User savedUser = this.userService.addUser(user);
        return new ResponseEntity<User>(savedUser, HttpStatus.OK);
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.PUT)
    public ResponseEntity<User> updateUser(@PathVariable("id")UUID userKey, @RequestBody User user) {
        User savedUser = this.userService.updateUser(userKey, user);
        return new ResponseEntity<User>(savedUser, HttpStatus.OK);
    }
}
