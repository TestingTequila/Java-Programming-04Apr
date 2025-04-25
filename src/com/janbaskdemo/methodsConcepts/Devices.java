package com.janbaskdemo.methodsConcepts;

public class Devices {
    public String[] getDevices(String empName) {
        String[] myDevices = {};

        if (empName.equals("Ravi")) {
            myDevices = new String[]{"macbook pro", "ipad", "iph15"};
        } else if (empName.equals("Jason")) {
            myDevices = new String[]{"Windows Laptop", "ipad"};

        } else if (empName.equals("Kerrie")) {
            myDevices = new String[]{"Windows Laptop", "ipad", "macbook pro", "samsung s11"};
        }
        return myDevices;
    }
}
