package com.w.core.service;

import com.w.core.Util;
import com.w.core.dao.UserDao;
import com.w.core.model.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class UserService extends CoreService<User, UserDao> implements UserDetailsService {

    @Resource
    private UserDao userDao;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userDao.get(username);
        user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
        return user;
    }

    public List<User> select() {
        return userDao.select(null);
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

    public User get(String id) {
        return userDao.get(id);
    }

}
