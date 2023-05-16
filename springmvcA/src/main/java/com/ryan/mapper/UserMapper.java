package com.ryan.mapper;

import com.ryan.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> getAll();

    User findUserByUnamePwd(String username, String password);
}
