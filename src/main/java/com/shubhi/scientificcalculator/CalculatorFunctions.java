package com.shubhi.scientificcalculator;

public class CalculatorFunctions {
    public double sqrt(double x) {
        return Math.sqrt(x);
    }

    public double fact(int x) {
        long i, fact=1;
        for(i = 1; i <= x; i++){
            fact *= i;
        }
        return fact;
    }

    public double log(double x) {
        return Math.log(x);
    }

    public double pow(double x, double y) {
        return Math.pow(x, y);
    }
}
