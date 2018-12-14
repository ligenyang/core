package com.w.core.service;

import com.w.core.dao.CoreDao;
import com.w.core.model.Core;

import java.util.List;

public abstract class CoreService<E extends Core> {

    protected abstract CoreDao<E> getDao();

    public E get(String id) {
        return this.getDao().get(id);
    }

    public List<E> select(E entity) {
        return this.getDao().select(entity);
    }

    public String insert(E entity) {
        this.getDao().insert(entity);
        return entity.getId();
    }

    public String update(E entity) {
        this.getDao().update(entity);
        return entity.getId();
    }

    public String updateAll(E entity) {
        this.getDao().update(entity);
        return entity.getId();
    }

    public String delete(String id) {
        this.getDao().delete(id);
        return id;
    }

}
