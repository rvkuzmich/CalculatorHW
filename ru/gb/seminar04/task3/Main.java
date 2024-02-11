package ru.gb.seminar04.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>(Arrays.asList(1, 56, 899, 65));
        Calculator calculator = new Calculator();
        System.out.println("calculator.sum(array) = " + calculator.sum(array));
        List<Double> array2 = new ArrayList<>(Arrays.asList(2.3,5.2));
        System.out.println("calculator.sum(array2) = " + calculator.sum(array2));
        List<Double> array3 = new ArrayList<>(Arrays.asList(6.0,2.0,3.0));
        System.out.println("calculator.division(array3) = " + calculator.division(array3));
        List<Double> array4 = new ArrayList<>(Arrays.asList(2.5, 3.2));
        System.out.println("calculator.multiplication(array4) = " + calculator.multiplication(array4));
        List<String> array5 = new ArrayList<>(List.of("110"));
        System.out.println("calculator.binaryConversion(array5) = " + calculator.binaryToDecimalConversion(array5));
        List<Integer> array6 = new ArrayList<>(Arrays.asList(110));
        System.out.println("calculator.binaryConversion(array6) = " + calculator.binaryToDecimalConversion(array6));
        List<Integer> array7 = new ArrayList<>(Arrays.asList(6));
        System.out.println("calculator.decimalToBinaryConversion(array7) = " + calculator.decimalToBinaryConversion(array7));
        System.out.println("calculator.doubleDecimalToBinaryConversion(58.14, 5) = " + calculator.doubleDecimalToBinaryConversion(58.14, 5));

    }
}
