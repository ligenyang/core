package com.w.core.controller;

import com.w.core.model.Menu;
import com.w.core.service.MenuService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class MenuController extends CoreController<Menu, MenuService> {

    @Resource
    private MenuService menuService;

    @Override
    public MenuService getEntityService() {
        return this.menuService;
    }

}
