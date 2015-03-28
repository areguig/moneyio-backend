package com.moneyio.datastore.repository.impl;

import com.moneyio.entity.User;
import com.moneyio.repository.UserRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by akli on 28/03/15.
 */
@Repository
public class UserRepositoryImpl implements UserRepository {
    @Override
    public User getUserByLogin(String login) {
        return null;
    }

    @Override
    public User getUserById(long idUser) {
        return null;
    }

    @Override
    public long createUser(User user) {
        return 0;
    }
}
