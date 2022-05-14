package com.becoder.service;


import com.becoder.model.Role;
import com.becoder.model.User;

import java.util.Optional;

public interface UserService {

    public User saveUser(User user);

    Optional<User> findByUserName(String username);

    void changeRole(Role newRole, String username);
}
