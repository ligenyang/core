package com.w.core.service;

import com.w.core.Util;
import com.w.core.dao.UserDao;
import com.w.core.model.User;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class UserService extends CoreService<User, UserDao> implements UserDetailsService {

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

    public User get(String id) {
        return userDao.get(id);
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = new User(s, "123456",
                AuthorityUtils.commaSeparatedStringToAuthorityList("admin"));
        return user;
    }
}
