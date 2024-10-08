package com.pluralsight.calculator;

import java.util.Scanner;

public class CalculationMainClass {

    //object declaration
    public static Calculation calc = new CalculationImpl();

    public static void main(String[] args) {
        System.out.println("Welcome to Java Calculator Application");

        System.out.println("Choose which Operation to perform");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("5.Modulus");

        System.out.println("Enter the Operation Number : ");

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        System.out.println("Enter the num1 : ");
        int num1 = sc.nextInt();

        System.out.println("Enter the num2 : ");
        int num2 = sc.nextInt();

        int result = processInput(input, num1, num2);
        System.out.println("The result of the Operation is : " +result);
        sc.close();
    }

    public static int processInput(String input, int num1 , int num2) {

        int result = 0;

        switch(input) {
            case "1":
                result = calc.addNumbers(num1, num2);
                break;
            case "2" :
                result = calc.subtractNumbers(num1, num2);
                break;
            case "3" :
                result = calc.multiplyNumbers(num1, num2);
                break;
            case "4" :
                result = calc.divideNumbers(num1, num2);
                break;
            case "5" :
                result = calc.moduloNumbers(num1,num2);

        }
        return result;

    }
}