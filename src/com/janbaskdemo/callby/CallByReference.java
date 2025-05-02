package com.janbaskdemo.callby;

public class CallByReference {
    private int a;//10
    private int b;//50

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public CallByReference(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void updateValue(CallByReference cbr, int a, int b) {
        cbr.a = a;
        cbr.b = b;
    }

}
