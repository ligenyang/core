package com.w.core.service;

import com.w.core.dao.UserDao;
import com.w.core.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {

    @Resource
    private UserDao userDao;

    public List<User> select() {
        return userDao.select();
    }

}
