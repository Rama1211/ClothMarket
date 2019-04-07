package com.dg.service.impl;

import com.dg.bean.User;
import com.dg.service.UserService;
import com.dg.utils.BusinessException;
import com.dg.utils.EmptyUtils;
import com.dg.utils.UserIO;

/**
 * 2019-04-06 9:24
 */
public class UserServiceImpl implements UserService {
    @Override
    public User register(User user) throws BusinessException {
        UserIO userIO=new UserIO();
        userIO.add(user);
        userIO.writeUsers();
        return user;
    }
    @Override
    public User login(String username, String password) throws BusinessException {
        if (EmptyUtils.isempty(username)){
            throw new BusinessException("username.notnull");
        }
        if (EmptyUtils.isempty(password)){
            throw new BusinessException("password.notnull");
        }
         UserIO userIO=new UserIO();
        User finduser = userIO.finduser(username, password);
        return finduser;
    }
}
