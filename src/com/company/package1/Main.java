package com.company.package1;

import com.company.Lesson2_1.POSIXTimeSupplier;
import com.company.Lesson2_1.TimeHolder;
import com.company.Lesson2_1.TimeSupplier;
import com.company.Lesson2_1.TimeSupplierInterface;

public class Main {
    public static void main(String[] args) {
        TimeSupplierInterface timeSupplier = new POSIXTimeSupplier();
        TimeHolder holder = new TimeHolder(timeSupplier);
        holder.printTime();
        holder.setTimeSupplier(new TimeSupplier());
        holder.printTime();

    }

}
