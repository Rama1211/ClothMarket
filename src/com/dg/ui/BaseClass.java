package com.dg.ui;

import com.dg.bean.User;

import java.util.ResourceBundle;
import java.util.Scanner;

/**
 * 2019-04-05 13:38
 */
public abstract class BaseClass {
    protected static Scanner input=new Scanner(System.in);
    protected static User curruser;//当前登录的用户对象
    private static ResourceBundle r=ResourceBundle.getBundle("com.dg.res.r");

    public static String getstring(String key)
    {
        return r.getString(key);

    }
    public static void println(String s){
        System.out.println(s);
    }
    public static void print(String s){
        System.out.print(s);
    }
}
