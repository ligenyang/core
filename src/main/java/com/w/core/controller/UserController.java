package com.w.core.controller;

import com.w.core.model.User;
import com.w.core.service.UserService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class UserController extends CoreController<User, UserService> {

    @Resource
    private UserService userService;

    @Override
    protected UserService getEntityService() {
        return userService;
    }
}
