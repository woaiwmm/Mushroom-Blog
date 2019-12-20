package com.mushroom.service;

import com.mushroom.po.User;

/**
 * 用户相关的逻辑处理
 */
public interface UserService {

    User checkUser(String username, String password);
}
