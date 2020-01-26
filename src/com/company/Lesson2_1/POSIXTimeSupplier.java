package com.company.Lesson2_1;

public class POSIXTimeSupplier extends TimeSupplier implements TimeSupplierInterface{
    public long getTime(){
        return super.getTime()/1000;
    }

}
