package com.ryan.service.impl;

import com.ryan.mapper.UserMapper;
import com.ryan.pojo.User;
import com.ryan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public User getUserByUsernameAndPwd(String username, String password) {
        return userMapper.findUserByUnamePwd(username, password);
    }

    public List<User> findAllUser() {
        return userMapper.getAll();
    }
}
