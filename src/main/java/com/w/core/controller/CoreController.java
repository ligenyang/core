package com.w.core.controller;

import com.w.core.model.Core;
import com.w.core.service.CoreService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CoreController<E extends Core, S extends CoreService> {

    /**
     * /templates/login.html
     */
    @RequestMapping("login")
    public String hello() {
        return "login";
    }

    /**
     * /templates/index.html
     */
    @RequestMapping("success")
    public String success() {
        return "index";
    }

}
