package com.w.core.dao;

import com.w.core.model.Core;

import java.util.List;

public interface CoreDao<E extends Core> {

    E get(String id);

    List<E> select(E entity);

    void insert(E entity);

    void update(E entity);

    void updateAll(E entity);

    void delete(String id);

}
