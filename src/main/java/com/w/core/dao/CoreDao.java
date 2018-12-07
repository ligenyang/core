package com.w.core.dao;

import com.w.core.model.Core;

import java.util.List;

public interface CoreDao<E extends Core> {

    List<E> select();
}
