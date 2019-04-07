package com.dg.ui;

import com.dg.utils.BusinessException;
import com.dg.utils.UserIO;
import org.junit.Test;

/**
 * 2019-04-05 13:45
 */
public class WelcomeClass extends BaseClass {
    public WelcomeClass() {
    }

    @Test
    public void start(){
        println(getstring("info.welcome"));
        UserIO userIO=new UserIO();
        userIO.readUsers();
        boolean flag=true;
        while (flag){
            println(getstring("info.login.reg"));
            println(getstring("info.select"));
            String select=input.nextLine();
            switch (select){
                case "1":

                    try {
                        new LoginClass().login();
                        println(getstring("login.success"));
                        flag=false;
                    } catch (BusinessException e) {
                        println(getstring(e.getMessage()));
                    }
                    break;
                case "2":

                    try {
                        RegisterClass registerClass = new RegisterClass();
                        registerClass.register();
                        println(getstring("reg.success"));
                        flag=false;
                    }catch(BusinessException e) {
                        println(getstring("reg.error"));
                }

                    break;
                    default:
                     print(getstring("input.error"));
                        break;
            }
        }
    }
}
