package com.codegym.calculator.controller;

import com.codegym.calculator.model.LinearEquationResult;
import com.codegym.calculator.services.CalculatorServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CalculatorController {

    @Autowired
    private CalculatorServices calculatorServices;

    @GetMapping("/calculate")
    public String calculator(@RequestBody String operation){
        return calculatorServices.calculatePostfix(calculatorServices.toPostfix(operation));
    }

    @GetMapping("/linear")
    public LinearEquationResult linearEquationResult(@RequestParam float a,@RequestParam float b) {
        return calculatorServices.solveLinearEquation(a,b);
    }

}
