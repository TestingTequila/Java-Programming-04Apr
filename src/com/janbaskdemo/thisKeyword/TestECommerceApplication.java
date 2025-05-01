package com.janbaskdemo.thisKeyword;

public class TestECommerceApplication
{
    public static void main(String[] args) {
        EcommerceApplication ecommerceApplication = new EcommerceApplication();
//        ecommerceApplication.doLogin();
//        ecommerceApplication.doSearch("Laptop", 1400);
//        ecommerceApplication.doAddToTheCart("Laptop");
//        ecommerceApplication.doPayment("ashish.mishra.sse");
//        ecommerceApplication.generateOrder();
//        ecommerceApplication.logOut();

        System.out.println("====Using Builder Pattern=========");
        ecommerceApplication.doLogin().doSearch("Laptop").logOut();

        ecommerceApplication.doLogin("ashish@gmail.com", "test@1234").doAddToTheCart("Laptop").doPayment("a.s@payapl");
    }
}
