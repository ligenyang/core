package com.w.core.dao;

import com.w.core.model.Core;
import com.w.core.model.Resource;

import java.util.List;
import java.util.Map;

public interface CoreDao<E extends Core> {

    List<E> select(Map map);

    void insert(E entity);

    void update(E entity);

    void updateAll(E entity);

    E get(String id);
}
