package com.dg.utils;

import com.dg.bean.User;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 2019-04-06 9:34
 */
public class UserIO {
    private static List<User> users=new ArrayList<>();
    public static final String USER_FILE="user.obj";
    //写入用户列表
    public boolean writeUsers() throws BusinessException{
        try {
            ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("user.obj"));
            out.writeObject(users);
            out.close();
        } catch (IOException e) {
            throw new BusinessException("io.write.error");
        }
        return true;

    }
    public Object readUsers() throws BusinessException{
        try {
            ObjectInputStream in=new ObjectInputStream(new FileInputStream(USER_FILE));
                users= (List<User>)in.readObject();
                in.close();
                return true;
            } catch (ClassNotFoundException|IOException e) {
              throw new BusinessException("io.read.error");
    }
        }
    public void add(User user){
        user.setId(users.size()+1);
        users.add(user);
    }
    public User finduser(String username,String password){
        for (User u:users){
            if (u.getUsername().equals(username)||u.getPassword().equals(password)){
                return u;
            }
        }
        return null;
    }
}
