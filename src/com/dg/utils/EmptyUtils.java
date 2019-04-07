package com.dg.utils;

/**
 * 2019-04-06 10:55
 */
public class EmptyUtils {
    public static boolean isempty(String s){
        if (null==s||"".equals(s)){
            return true;
        }else {
            return false;
        }
    }
}
