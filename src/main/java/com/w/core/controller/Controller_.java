package com.w.core.controller;

import com.w.core.model.UserModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controller_ {

    @RequestMapping("index")
    public String index() {

        UserModel o = new UserModel();
        return "index";
    }
}
