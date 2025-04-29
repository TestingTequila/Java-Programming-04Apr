package com.janbaskdemo.constructors;

public class Login
{
    String username;
    String password;

   public Login(String username, String password)
    {
        this.username = username;
        this.password= password;
    }

    public  void checkLogin()
    {
        if(username.equals("ashish2518")&& password.equals("test@1234"))
        {
            System.out.println("Login is successfully done...");
        }
        else
        {
            System.out.println("Login Failed...Please check your Crededntials.....");
        }
    }
}
