package com.janbaskdemo.thisKeyword;

public class EcommerceApplication
{
    public  EcommerceApplication doLogin()
    {
        System.out.println("login into the app");
        return this;
    }

    public  EcommerceApplication doLogin(String email, String password)
    {
        System.out.println("login into the app" + email + " and " + password);
        return this;
    }

    public  EcommerceApplication doSearch(String productName)
    {
        System.out.println("Search by product Name: " + productName);
        return this;
    }

    public  EcommerceApplication doSearch(String productName, String brandName)
    {
        System.out.println("Search by product Name: " + productName + " and brand Name as: " + brandName);
        return this;
    }

    public  EcommerceApplication doSearch(String productName, int price)
    {
        System.out.println("Search by product Name: " + productName + " and Product Price as: " + price);
        return this;
    }

    public  EcommerceApplication  doAddToTheCart(String productName)
    {
        System.out.println("Adding the " + productName + " to my Cart");
        return this;
    }

    public  EcommerceApplication  doAddToTheCart(String productName, int quantity)
    {
        System.out.println("Adding" + quantity + " of " + productName + " into my Cart");
        return this;
    }

    public  EcommerceApplication doPayment(String cc, short cvv)
    {
        System.out.println(" making payment using Credit Card " + cc + " and " + cvv);
        return this;
    }

    public  EcommerceApplication doPayment(String paypalDetails)
    {
        System.out.println(" making payment using Paypal  " + paypalDetails );
        return this;
    }
    public  EcommerceApplication generateOrder()
    {
        System.out.println("Order generated: " + 1212423);
        return this;
    }

    public  void logOut()
    {
        System.out.println(" Logging out of the portal.....");
    }
}
