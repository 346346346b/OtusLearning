package com.company.Lesson2_2.TemplateMethod;

public class Minus extends BinaryOperation {
    Minus(int a, int b) {
        super(a, b);
    }

    @Override
    protected int apply(int a, int b) {
        return a - b;
    }
}