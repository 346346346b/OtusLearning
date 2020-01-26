package com.company.Lesson2_2.TemplateMethod;

public abstract class BinaryOperation {
    /*
    Common part of the subclasses.
     */
    private final int a;
    private final int b;

    BinaryOperation(int a, int b) {
        this.a = a;
        this.b = b;
    }

    int getResult() {
        return apply(a, b);
    }


    /**
     * Different algorithms of the subclasses.
     *
     * @param a the first argument
     * @param b the second argument
     * @return result of the algorithm
     */
    protected abstract int apply(int a, int b);
}