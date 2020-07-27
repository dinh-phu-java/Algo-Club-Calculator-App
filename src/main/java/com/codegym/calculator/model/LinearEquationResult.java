package com.codegym.calculator.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class LinearEquationResult {
    private String message;
    private String fractionRoot ;
    private float decimalRoot;

}
