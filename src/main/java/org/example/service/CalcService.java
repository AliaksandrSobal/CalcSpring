package org.example.service;

import org.springframework.stereotype.Component;

@Component
public class CalcService {
    private double sum(double num1, double num2){
        return num1 + num2;
    }

    private double sub(double num1, double num2){
        return num1 - num2;
    }

    private double mul(double num1, double num2){
        return num1 * num2;
    }

    private double div(double num1, double num2){
        return num1 / num2;
    }
    public double calculate(String opType, double num1, double num2){
        double result = 0;
        switch (opType){
            case "sum":
                result = sum(num1, num2);
                break;
            case "sub":
                result = sub(num1, num2);
                break;
            case "mul":
                result = mul(num1, num2);
                break;
            case "div":
                result = div(num1, num2);
                break;
            default:

        }
        return result;
    }
}
