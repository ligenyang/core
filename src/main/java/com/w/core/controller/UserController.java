package com.w.core.controller;

import com.w.core.model.Menu;
import com.w.core.model.User;
import com.w.core.service.MenuService;
import com.w.core.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class UserController extends CoreController<User, UserService> {

    @Resource
    private UserService userService;

    @Resource
    private MenuService menuService;

    @Override
    protected UserService getEntityService() {
        return userService;
    }

    @RequestMapping("login")
    public String login(String username, String password) {
        return "login";
    }

    @RequestMapping("index")
    public String index(Model model) {
        List<Menu> menuList = menuService.select(null);
        model.addAttribute("menuList", menuList);
        return "index";
    }

    @RequestMapping("user/list")
    public String list(Model model) {
        List<User> userList = userService.select(null);
        model.addAttribute("userList", userList);
        return "user/user_list";
    }
}
