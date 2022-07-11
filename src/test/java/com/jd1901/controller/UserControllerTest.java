package com.jd1901.controller;

import com.jd1901.UserController;
import com.jd1901.bean.User;
import org.junit.jupiter.api.Test;

public class UserControllerTest {
    @Test
    public void testAddUser(){
        UserController userController = new UserController();
        userController.addUser(new User());
    }
}
