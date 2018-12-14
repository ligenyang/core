package com.w.core.service;

import com.w.core.dao.CoreDao;
import com.w.core.dao.MenuDao;
import com.w.core.model.Menu;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class MenuService extends CoreService<Menu> {

    @Resource
    private MenuDao menuDao;

    @Override
    protected CoreDao getDao() {
        return this.menuDao;
    }
}
