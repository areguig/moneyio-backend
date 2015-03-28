package com.moneyio.service.impl;

import com.moneyio.repository.UserRepository;
import com.moneyio.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by akli on 28/03/15.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public long createUser(String login, String email, String password) {
        return 0;
    }
}
