package com.pluralsight.calculator;

public interface Calculation {

// A Method which is declared as abstract and does not have implementation is known as Abstract Method.
    public int addNumbers(int num1, int num2);

    public int subtractNumbers(int num1, int num2);

    public int multiplyNumbers(int num1, int num2);

    public int divideNumbers(int num1, int num2);

    public int moduloNumbers(int num1, int num2) throws ArithmeticException;


}
