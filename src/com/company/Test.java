package com.company;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

public class Test {
    public static void main(String[] args) throws Exception {
        A a = a();
                System.out.println(a.getValue());
        try {
            a.printPositivInt(-1);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(a.getConstanta());

    }
    private static A a(){
        A a = new A();
        return a;
    }
}

class A{
    private int DEFAULT_VALUE=20;
    private int value = DEFAULT_VALUE;
    private final int constanta = 22;

    public void printPositivInt(int i) throws Exception {
        if(i<0){
            throw new Exception("Not positiv value: " + i);
        }
        System.out.println(i);
    }
    int getValue(){
        return value;
    }
    int getConstanta(){
        return constanta;
    }
}
