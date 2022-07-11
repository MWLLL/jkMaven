package com.jd1901.service.impl;

import com.jd1901.UserDao;
import com.jd1901.bean.User;
import com.jd1901.impl.UserDaoImpl;
import com.jd1901.service.UserService;

public class UserServiceImpl implements UserService {

    private UserDao userDao = new UserDaoImpl();
    @Override
    public int addUser(User user) {
        System.out.println("UserServiceImpl.addUser 调用了服务层的新增用户");
        return userDao.addUser(user);
    }
}
