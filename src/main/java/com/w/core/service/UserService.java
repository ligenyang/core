package com.w.core.service;

import com.w.core.Util;
import com.w.core.dao.UserDao;
import com.w.core.model.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class UserService extends CoreService<User, UserDao> {

    @Resource
    private UserDao userDao;

    public List<User> select() {
        return userDao.select();
    }

    public void insert(User user) {
        user.setId(Util.generator());
        userDao.insert(user);
    }

    public void update(User user) {
        userDao.insert(user);
    }

    public void updateAll(User user) {
        userDao.insert(user);
    }

}
