package com.jd1901.impl;

import com.jd1901.UserDao;
import com.jd1901.bean.User;

public class UserDaoImpl implements UserDao {
    @Override
    public int addUser(User user) {
        System.out.println("UserDaoImpl.addUser 完成了数据库的新增");
        return 1;
    }
}
