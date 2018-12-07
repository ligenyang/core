package com.w.core.dao;

import com.w.core.model.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao extends CoreDao<User> {

}
