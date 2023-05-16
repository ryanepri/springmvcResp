package com.ryan.service;

import com.ryan.pojo.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
@Service
@Transactional
public interface UserService {

    User getUserByUsernameAndPwd(String username, String password);

    List<User> findAllUser();
}
