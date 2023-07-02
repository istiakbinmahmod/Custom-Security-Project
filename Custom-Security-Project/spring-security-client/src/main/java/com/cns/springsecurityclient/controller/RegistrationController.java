package com.cns.springsecurityclient.controller;

import com.cns.springsecurityclient.entity.User;
import com.cns.springsecurityclient.model.UserModel;
import com.cns.springsecurityclient.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public String registerUser(@RequestBody UserModel userModel) {
        User user = userService.registerUser(userModel);
        return "User " + user.getFirstName() + " " + user.getLastName() + " registered successfully";
    }
}
