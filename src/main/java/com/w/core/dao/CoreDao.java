package com.w.core.dao;

import com.w.core.model.Core;
import com.w.core.model.User;

import java.util.List;

public interface CoreDao<E extends Core> {

    List<E> select();

    void insert(User user);

    void update(User user);

    void updateAll(User user);

    E get(String id);
}
