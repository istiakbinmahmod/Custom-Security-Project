package com.cns.springsecurityclient.service;

import com.cns.springsecurityclient.entity.User;
import com.cns.springsecurityclient.model.UserModel;

public interface UserService {
    public User registerUser(UserModel userModel);
}
