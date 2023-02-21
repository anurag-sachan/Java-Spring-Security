package com.java.security.service;

import com.java.security.entity.User;
import com.java.security.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService{
    User save(UserRegistrationDto userRegistrationDto);
}