package com.dg.service;

import com.dg.bean.User;
import com.dg.utils.BusinessException;

/**
 * 2019-04-06 9:23
 */
public interface UserService {
    public User register(User user) throws BusinessException;
    public User login(String username,String password) throws BusinessException;
}
