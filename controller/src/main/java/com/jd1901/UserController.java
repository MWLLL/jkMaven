package com.jd1901;


import com.jd1901.bean.User;
import com.jd1901.service.UserService;
import com.jd1901.service.impl.UserServiceImpl;

public class UserController {
    private UserService userService = new UserServiceImpl();

    public int addUser(User user){
        return userService.addUser();
    }
}
