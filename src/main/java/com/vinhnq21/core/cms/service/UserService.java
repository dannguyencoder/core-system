package com.vinhnq21.core.cms.service;

import com.vinhnq21.core.cms.entities.User;

import java.util.List;


public interface UserService {

    List<User> getAllUser();

    User getSingleUser(int userId);

    User insertUser(User userData);

    User updateUser(User newUserDataWithId);

    User deleteUser(int userId);

}
