package com.janbaskdemo.methodsConcepts;

public class Browser
{
    public  String launchBrowser(String browserName)
    {
        if(browserName.equals("Edge"))
        {
            return "Edge";
        }
        else if (browserName.equals("Chrome"))
        {
            return "Chrome";
        }
        else if (browserName.equals("Firefox"))
        {
            return "Firefox";
        }
        else if (browserName.equals("IE"))
        {
            return "IE";
        }
        return "Please enter a valid browser Name";
    }
}
