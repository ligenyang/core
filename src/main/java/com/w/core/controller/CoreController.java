package com.w.core.controller;

import com.w.core.model.Core;
import com.w.core.service.CoreService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public abstract class CoreController<E extends Core, S extends CoreService> {

    protected Class<E> entityClass;

    protected Class<E> getEntityClass() {
        return this.entityClass;
    }

    protected E entity;

    public E getEntity() {
        return this.entity;
    }

    protected List entityList = new ArrayList();

    public List<E> getEntityList() {
        return this.entityList;
    }

    public void setEntityList(List<E> entityList) {
        this.entityList = entityList;
    }

    protected abstract S getEntityService();

    @RequestMapping("login")
    public String login(String username, String password) {
        return "login";
    }

    @RequestMapping("index")
    public String index(Model model) {
        return "index";
    }

    public List<E> select(Model model) {

        return this.getEntityService().select(null);
    }

}
