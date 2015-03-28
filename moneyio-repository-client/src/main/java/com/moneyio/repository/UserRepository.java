package com.moneyio.repository;

import com.moneyio.entity.User;

/**
 * Created by akli on 28/03/15.
 */
public interface UserRepository {

    User getUserByLogin(String login);

    User getUserById(long idUser);

    long createUser(User user);


}
