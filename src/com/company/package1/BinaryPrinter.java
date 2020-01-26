package com.company.package1;

import javax.xml.bind.annotation.XmlType;

public class BinaryPrinter {
    private static int DEFAULT_SIZE = 8;
    private int size;

    public BinaryPrinter(int size){
        this.size = DEFAULT_SIZE;
    }

    public void print(long value){
        for(int i = size - 1; i >= 0; i--){
            long mask = 1L << i;
            long result = (mask & value) >> i;
            System.out.print(result);
        }
        System.out.println();
    }

    public int getSize(){
        return size;
    }

    public void setSize(int size) throws Exception {
        if (size <=0){
            throw new Exception("Illegal size : " + size);
        }
        this.size = size;
    }
}
