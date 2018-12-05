package com.w.core.controller;

import com.w.core.model.User;
import com.w.core.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("select")
    public String select(Model model) {
        List<User> users = userService.select();

        model.addAttribute("users", users);
        return "user/user";
    }

}
