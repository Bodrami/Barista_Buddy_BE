package com.project.baristabuddy_be.calculator.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
public class CalculatorDTO {

    private int num1;
    private String operator;
    private int num2;

}
