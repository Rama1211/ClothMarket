package com.dg.utils;

/**
 * 2019-04-06 9:18
 */
public class BusinessException extends RuntimeException {
    public BusinessException(){
        super();
    }
    public BusinessException(String errorMessage){
        super(errorMessage);
    }
}
