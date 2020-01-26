package com.company.Lesson2_2.TemplateMethod;

public class Plus extends BinaryOperation {

    Plus(int a, int b) {
        super(a, b);
    }

    @Override
    protected int apply(int a, int b) {
        return a + b;
    }
}
