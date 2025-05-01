package com.janbaskdemo.thisKeyword;

public class EcommerceApplication2
{
    public EcommerceApplication2 doLogin()
    {
        System.out.println("login into the app");
        return this;
    }

    public EcommerceApplication2 doLogin(String email, String password)
    {
        System.out.println("login into the app" + email + " and " + password);
        return new EcommerceApplication2();
    }

    public EcommerceApplication2 doSearch(String productName)
    {
        System.out.println("Search by product Name: " + productName);
        return new EcommerceApplication2();
    }

    public EcommerceApplication2 doSearch(String productName, String brandName)
    {
        System.out.println("Search by product Name: " + productName + " and brand Name as: " + brandName);
        return new EcommerceApplication2();
    }

    public EcommerceApplication2 doSearch(String productName, int price)
    {
        System.out.println("Search by product Name: " + productName + " and Product Price as: " + price);
        return new EcommerceApplication2();
    }

    public EcommerceApplication2 doAddToTheCart(String productName)
    {
        System.out.println("Adding the " + productName + " to my Cart");
        return new EcommerceApplication2();
    }

    public EcommerceApplication2 doAddToTheCart(String productName, int quantity)
    {
        System.out.println("Adding" + quantity + " of " + productName + " into my Cart");
        return new EcommerceApplication2();
    }

    public EcommerceApplication2 doPayment(String cc, short cvv)
    {
        System.out.println(" making payment using Credit Card " + cc + " and " + cvv);
        return new EcommerceApplication2();
    }

    public EcommerceApplication2 doPayment(String paypalDetails)
    {
        System.out.println(" making payment using Paypal  " + paypalDetails );
        return new EcommerceApplication2();
    }
    public EcommerceApplication2 generateOrder()
    {
        System.out.println("Order generated: " + 1212423);
        return new EcommerceApplication2();
    }

    public  void logOut()
    {
        System.out.println(" Logging out of the portal.....");
    }
}
