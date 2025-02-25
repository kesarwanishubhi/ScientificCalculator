package com.shubhi.scientificcalculator.controller;

import com.shubhi.scientificcalculator.service.CalculatorService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("/sqrt/{number}")
    public double squareRoot(@PathVariable double number) {
        return calculatorService.squareRoot(number);
    }

    @GetMapping("/power")
    public double power(@RequestParam double base, @RequestParam double exponent) {
        return calculatorService.power(base, exponent);
    }

    @GetMapping("/sin/{angle}")
    public double sine(@PathVariable double angle) {
        return calculatorService.sine(angle);
    }

    @GetMapping("/cos/{angle}")
    public double cosine(@PathVariable double angle) {
        return calculatorService.cosine(angle);
    }
}
