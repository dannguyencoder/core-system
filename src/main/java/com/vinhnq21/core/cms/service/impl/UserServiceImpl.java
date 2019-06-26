package com.vinhnq21.core.cms.service.impl;

import com.vinhnq21.core.cms.dto.UserDTO;
import com.vinhnq21.core.cms.entities.User;
import com.vinhnq21.core.cms.repository.UserRepository;
import com.vinhnq21.core.cms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public List<UserDTO> getAllUser() {
        return userRepository.getUsers();
    }

    @Override
    public User getSingleUser(int userId) {
        Optional<User> optionalUser = userRepository.findById(userId);
        if (!optionalUser.isPresent()) {
            throw new RuntimeException("User not found");
        } else {
            return optionalUser.get();
        }
    }

    @Override
    public User insertUser(User userData) {

        userData.setId(0);

        userRepository.save(userData);

        return userData;
    }

    @Override
    public User updateUser(User newUserDataWithId) {

        Optional<User> optionalUser = userRepository.findById(newUserDataWithId.getId());

        if (!optionalUser.isPresent()) {
            throw new RuntimeException("User not found");
        } else {
            userRepository.save(newUserDataWithId);
        }

        return newUserDataWithId;
    }

    @Override
    public User deleteUser(int userId) {

        Optional<User> optionalUser = userRepository.findById(userId);

        if (!optionalUser.isPresent()) {
            throw new RuntimeException("User not found");
        } else {
            userRepository.deleteById(userId);
        }

        return optionalUser.get();
    }

}
