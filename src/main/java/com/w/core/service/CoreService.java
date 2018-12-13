package com.w.core.service;

import com.w.core.dao.CoreDao;
import com.w.core.model.Core;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CoreService<E extends Core, S extends CoreDao> implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return new User(username, "123456", );
    }
}
