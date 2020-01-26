package com.company.Lesson2_1;

public class TimeHolder {
    private TimeSupplierInterface timeSupplier;

    public TimeHolder(TimeSupplierInterface supplier){
        setTimeSupplier(timeSupplier);
    }
    public void printTime(){
        System.out.println("POSIX: " +timeSupplier.getTime());
    }

    public void setTimeSupplier(TimeSupplierInterface timeSupplier){
        this.timeSupplier = timeSupplier ;
    }
}
