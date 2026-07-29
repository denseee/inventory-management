package com.smartshelf;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordGenerator {

    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String password = "SmartShelf@123";

        System.out.println("Password: " + password);
        System.out.println("Hash: " + encoder.encode(password));
    }
}