package com.w.core.service;

import com.w.core.dao.CoreDao;
import com.w.core.dao.UserDao;
import com.w.core.model.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class UserService extends CoreService<User> implements UserDetailsService {

    @Resource
    private UserDao userDao;

    @Override
    protected CoreDao<User> getDao() {
        return this.getDao();
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userDao.get(username);
        user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
        return user;
    }

}
