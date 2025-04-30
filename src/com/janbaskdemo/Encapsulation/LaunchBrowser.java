package com.janbaskdemo.Encapsulation;

public class LaunchBrowser
{
    //checkVersion
    //checkRAM
    //checkOS
    //checkBrowserServices
    //launchingBrowser

    private   void checkVersion()
    {
        System.out.println("checkVersion");
    }

    private   void checkRAM()
    {
        System.out.println("checkRAM");
    }
    private   void checkOS()
    {
        System.out.println("checkOS");
    }
    private   void checkBrowserServices()
    {
        System.out.println("checkBrowserServices");
    }
    public  void launchingBrowser()
    {
        checkVersion();
        checkRAM();
        checkBrowserServices();
        checkOS();
        System.out.println("launchingBrowser");
    }
}
