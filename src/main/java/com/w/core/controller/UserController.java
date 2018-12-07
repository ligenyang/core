package com.w.core.controller;

import com.w.core.model.User;
import com.w.core.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("user")
public class UserController extends CoreController<User, UserService> {

    @Resource
    private UserService userService;


    @RequestMapping("select")
    public String select(Model model) {
        List<User> userList = userService.select();
        model.addAttribute("userList", userList);
        return "user/select";
    }

    @RequestMapping(value = "core", method = RequestMethod.GET)
    @ResponseBody
    public String core() {

        return "core";
    }

}
