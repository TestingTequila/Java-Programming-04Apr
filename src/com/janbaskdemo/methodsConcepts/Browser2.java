package com.janbaskdemo.methodsConcepts;

public class Browser2
{
    public  String launchBrowser(String browserName)
    {
        String myBrowser= "Please enter a valid browser Name";

        if(browserName.equals("Edge"))
        {
            myBrowser= "Edge";
        }
        else if (browserName.equals("Chrome"))
        {
            myBrowser=  "Chrome";
        }
        else if (browserName.equals("Firefox"))
        {
            myBrowser=  "Firefox";
        }
        else if (browserName.equals("IE"))
        {
            myBrowser=  "IE";
        }
        return myBrowser;
    }
}
