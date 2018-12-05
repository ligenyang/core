package com.w.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CoreController<E, S> {


    @RequestMapping("{core}")
    public String core(@PathVariable String core) {
        return core;
    }
}
