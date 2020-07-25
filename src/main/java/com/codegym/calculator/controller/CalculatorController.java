package com.codegym.calculator.controller;

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
    public float calculator(@RequestParam String operation){
        List<String> operatorList=  calculatorServices.convertStringToList(operation);
        List<String> postFixList=calculatorServices.toPostFixWithBrace(operatorList);
        float result=calculatorServices.postFixToResult(postFixList);
        return result;
    }

}
