package com.company.Lesson2_2.Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton.instance().setMessage("Hello");

        new Main().print();
        new Main().print();
        Singleton.instance().setMessage("Hello1");
        new Main().print();
        new Main().print();


    }

    private void print(){
        System.out.println(Singleton.instance().getMessage());
    }
}