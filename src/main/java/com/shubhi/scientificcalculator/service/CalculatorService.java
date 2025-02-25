package com.shubhi.scientificcalculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    // Method to calculate square root
    public double squareRoot(double num) {
        return Math.sqrt(num);
    }

    // Method to calculate power
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    // Method to calculate sine of an angle (in degrees)
    public double sine(double angle) {
        return Math.sin(Math.toRadians(angle));
    }

    // Method to calculate cosine of an angle (in degrees)
    public double cosine(double angle) {
        return Math.cos(Math.toRadians(angle));
    }
}
