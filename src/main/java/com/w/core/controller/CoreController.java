package com.w.core.controller;

import com.w.core.model.Core;
import com.w.core.service.CoreService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CoreController<E extends Core, S extends CoreService> {

    @RequestMapping("login")
    public String login(String username, String password) {
        return "login";
    }

    @RequestMapping("index")
    public String index() {
        return "index";
    }

}
