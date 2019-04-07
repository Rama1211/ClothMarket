package com.dg.ui;

import com.dg.bean.User;
import com.dg.service.UserService;
import com.dg.service.impl.UserServiceImpl;
import com.dg.utils.BusinessException;

/**
 * 2019-04-06 10:17
 */
public class LoginClass extends BaseClass{
    public void login()throws BusinessException {
        println(getstring("input.username"));
        String username=input.nextLine();
        println(getstring("input.password"));
        String password=input.nextLine();
        UserService userService=new UserServiceImpl();
        User user = userService.login(username, password);
        if (user!=null){
            curruser=user;
        }else {
            throw new BusinessException("login.error");
        }
    }
}
