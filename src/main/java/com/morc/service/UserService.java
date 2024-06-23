package com.morc.service;

import com.morc.model.User;
import jdk.jshell.spi.ExecutionControl;

public interface UserService {
    public  User findUserByJwtToken(String jwt) throws Exception;
    public User findUserByEmail(String email) throws Exception;
}
