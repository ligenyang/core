package com.w.core.dao;

import com.w.core.model.UserModel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {

    List<UserModel> select();
}
