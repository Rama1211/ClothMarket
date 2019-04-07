package com.dg.ui;

import com.dg.bean.User;
import com.dg.service.UserService;
import com.dg.service.impl.UserServiceImpl;
import com.dg.utils.BusinessException;

/**
 * 2019-04-06 9:17
 */
public class RegisterClass extends BaseClass {
    public void register() throws BusinessException {
    println(getstring("input.username"));
    String username=input.nextLine();
        println(getstring("input.password"));
        String password=input.nextLine();
        User user=new User(username,password);
        UserService userService=new UserServiceImpl();
        userService.register(user);
    }

}
