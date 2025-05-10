package com.janbaskdemo.InheritanceInSelenium;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RemoteWebDriver implements WebDriver, JavaScripExecutor, HasVirtualAuthenticator, TakeScreenshot, HasCapabilities
{

    @Override
    public void findElement(String element) {
        System.out.println("FIND ELEMENT: " + element);
    }

    @Override
    public void findElements(String[] element) {
        System.out.println("FIND ELEMENTS: " + Arrays.toString(element));
    }

    @Override
    public void get(String url) {
        System.out.println("URL: " + url);
    }

    @Override
    public String getTitle() {
        System.out.println("Page Title");
        return null;
    }

    @Override
    public void click(String element) {
        System.out.println("CLICK: " + element);
    }

    @Override
    public void sendKeys(String element, String text) {
        System.out.println("ENTER TEXT IN: " + element + " WITH TEXT AS: " + text);
    }

    @Override
    public void close() {
        System.out.println("CLOSE THE BROWSER");
    }

    @Override
    public void getJavaScripExecutor() {
        System.out.println("JAVA_SCRIPT_EXECUTOR");
    }

    @Override
    public void getHasVirtualAuthenticator() {
        System.out.println("HAS_VIRTUAL_AUTHENTICATOR");
    }

    @Override
    public void getHasCapabilities() {
        System.out.println("HAS_CAPABILITIES");
    }

    @Override
    public void getTakeScreenshot() {
        System.out.println("TAKE_SCREENSHOT");
    }

    public  void myDriver()
    {
        System.out.println("REMOTE_WEB_DRIVER: MY_DRIVER");
    }
}
