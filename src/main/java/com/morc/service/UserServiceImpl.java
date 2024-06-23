package com.morc.service;

import com.morc.Repository.UserRepository;
import com.morc.config.Jwtprovider;
import com.morc.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private Jwtprovider jwtprovider;

    @Override
    public User findUserByEmail(String email) throws Exception{
        User user=userRepository.findByEmail(email);

        if(user==null){
            throw new Exception("User Not Found");
        }
        return user;
    };

    @Override
    public User findUserByJwtToken(String jwt) throws Exception{
        String email=jwtprovider.getEmailFromJwtToken(jwt);
        return findUserByEmail(email);
    }
}
