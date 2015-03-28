package com.moneyio.service;

/**
 * Created by akli on 28/03/15.
 */
public interface UserService {

    long createUser(String login, String email, String password);
}
