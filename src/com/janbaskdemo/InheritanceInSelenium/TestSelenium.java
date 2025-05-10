package com.janbaskdemo.InheritanceInSelenium;

public class TestSelenium
{
    public static void main(String[] args) {
        ChromiumDriver chromiumDriver = new ChromiumDriver();
        chromiumDriver.get("https://www.americantimes.com");
        chromiumDriver.click("EmailTextBox");
        chromiumDriver.findElement("TextBox");
        chromiumDriver.findElements(new String[]{"EmailTextBox", "passwordTextBox", "LoginButton", "forgottenPassword Link"});
        chromiumDriver.getChromiumDriver();
        chromiumDriver.getHasCapabilities();
        chromiumDriver.getTakeScreenshot();
        chromiumDriver.getTitle();
        chromiumDriver.getHasVirtualAuthenticator();
        chromiumDriver.getJavaScripExecutor();
        chromiumDriver.sendKeys("EmailTextBox", "Jason");
        chromiumDriver.myDriver();
        chromiumDriver.close();
        chromiumDriver.getChromiumDriver();

        System.out.println("====================================");
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.getChromeDriver();
        chromeDriver.click("Message Text box");
        chromeDriver.click("BUTTON");
        chromeDriver.getChromiumDriver();
        chromeDriver.get("https://www.bankofamerica.com");
        chromeDriver.findElement("password text box");

        System.out.println("=============================");
        EdgeDriver edgeDriver = new EdgeDriver();
        edgeDriver.getEdgeDriver();
        edgeDriver.getChromiumDriver();
        edgeDriver.getHasCapabilities();
        edgeDriver.getJavaScripExecutor();

        System.out.println("====TOP CASTING==============");
        ChromiumDriver driver=new ChromeDriver();
        driver.myDriver();
        driver.getJavaScripExecutor();
        driver.getTakeScreenshot();
        driver.getHasCapabilities();
        driver.getChromiumDriver();

        System.out.println("------------------------------");
        RemoteWebDriver driver1= new ChromeDriver();
        driver1.findElement("ELEMENT");
        driver1.get("https://janbaskdemo.com/");
        driver1.getHasVirtualAuthenticator();
        driver1.close();
        driver1.getJavaScripExecutor();

        System.out.println("=====================================");
        WebDriver driver2= new ChromeDriver();
        driver2.getTitle();
        driver2.close();

    }
}
