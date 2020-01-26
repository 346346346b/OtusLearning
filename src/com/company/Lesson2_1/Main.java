package com.company.Lesson2_1;

import com.company.package1.BinaryPrinter;

public class Main {

    public static void main(String[] args) {
        
        System.out.println();

        BinaryPrinter printer = creatPrinter(12);
        System.out.println("Size " + printer.getSize());

        int value = -4;
        doPrinter(printer,value);
        System.out.println("Size " + printer.getSize());

    }

    private static BinaryPrinter creatPrinter(int size){
        BinaryPrinter printer= new BinaryPrinter(size);
        return printer;
    }
    private static void doPrinter(BinaryPrinter printer, int value){
        printer.print(value);
        try {
            printer.setSize(value);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
