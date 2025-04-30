package com.janbaskdemo.Encapsulation;

public class TestCompany
{
    public static void main(String[] args) {
        Company company = new Company();
        company.setName("Microsoft");
        company.setEmpCount(500);
        company.setSharePrice(57);
        System.out.println(company.getName() + ", " + company.getEmpCount()+", " + company.getSharePrice());

        System.out.println("================================================");
        Company2 company2 = new Company2("Tesla", 300, 456);
        System.out.println(company2.getName() + ", " + company2.getEmpCount()+", " + company2.getSharePrice());

        System.out.println("================================================");
        Company3 company3 = new Company3("Adobe", 450, 300);
        System.out.println(company3.getName() + ", " + company3.getEmpCount()+", " + company3.getSharePrice());
        company3.setSharePrice(350);
        System.out.println(company3.getName() + ", " + company3.getEmpCount()+", " + company3.getSharePrice());


    }
}
