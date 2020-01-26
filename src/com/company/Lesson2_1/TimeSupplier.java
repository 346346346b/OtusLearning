package com.company.Lesson2_1;

public class TimeSupplier implements TimeSupplierInterface{
    public long getTime(){
        return System.currentTimeMillis();
    }
}
