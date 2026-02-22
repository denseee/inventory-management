package com.inventory.service;

import com.inventory.entity.User;

public interface UserService {

    User findByUsername(String username);

}
