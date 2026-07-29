package com.smartshelf.service;

import com.smartshelf.entity.User;

public interface UserService {

    User findByUsername(String username);

}
