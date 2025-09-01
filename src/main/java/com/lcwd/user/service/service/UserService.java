package com.lcwd.user.service.service;

import com.lcwd.user.service.entites.User;
import java.util.List;

public interface UserService {
    User saveUser(User user);
    User getUser(String userId);
    List<User> getAllUsers();
    void deleteUser(String userId);
}
