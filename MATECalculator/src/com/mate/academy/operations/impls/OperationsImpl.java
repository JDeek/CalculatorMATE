package com.mate.academy.operations.impls;

import com.mate.academy.operations.Operations;
import com.mate.academy.parser.IntegerParse;


import java.util.InputMismatchException;


public class OperationsImpl implements Operations {
    @Override
    public double add(String firstArgument, String secondArgument) {
        try {
           if (romaNumCheck(firstArgument,secondArgument)){
               String[] arr = new String[2];
               arr[0] = firstArgument;
               arr[1] = secondArgument;
               double[] readyInt = IntegerParse.parseToInteger(arr);
               return readyInt[0] + readyInt[1];
           }
           else {
               return Double.parseDouble(firstArgument) + Double.parseDouble(secondArgument);
           }
        }catch (InputMismatchException e){
            e.getMessage();
        }
        return 0;
    }

    @Override
    public double subtract(String firstArgument, String secondArgument) {
        try {
            if (romaNumCheck(firstArgument,secondArgument)){
                String[] arr = new String[2];
                arr[0] = firstArgument;
                arr[1] = secondArgument;
                double[] readyInt = IntegerParse.parseToInteger(arr);
                return readyInt[0] - readyInt[1];
            }
            else {
                return Double.parseDouble(firstArgument) - Double.parseDouble(secondArgument);
            }
        }catch (InputMismatchException e){
            e.getMessage();
        }
        return 0;
    }

    @Override
    public double divide(String firstArgument, String secondArgument) {
        try {
            if (romaNumCheck(firstArgument,secondArgument)){
                String[] arr = new String[2];
                arr[0] = firstArgument;
                arr[1] = secondArgument;
                double[] readyInt = IntegerParse.parseToInteger(arr);
                return readyInt[0] / readyInt[1];
            }
            else {
                return Double.parseDouble(firstArgument) / Double.parseDouble(secondArgument);
            }
        }catch (InputMismatchException e){
            e.getMessage();
        }
        return 0;
    }

    @Override
    public double multiple(String firstArgument, String secondArgument) {
        try {
            if (romaNumCheck(firstArgument,secondArgument)){
                String[] arr = new String[2];
                arr[0] = firstArgument;
                arr[1] = secondArgument;
                double[] readyInt = IntegerParse.parseToInteger(arr);
                return readyInt[0] * readyInt[1];
            }
            else {
                return Double.parseDouble(firstArgument) * Double.parseDouble(secondArgument);
            }
        }catch (InputMismatchException e){
            e.getMessage();
        }
        return 0;
    }

    private  boolean romaNumCheck(String firstArgument, String secondArgument){
        String regex = "\\d+";
            if (firstArgument.matches(regex) && !secondArgument.matches(regex)
                || secondArgument.matches(regex) && !firstArgument.matches(regex))
            {
                System.out.println("Input mismatch");
                throw new InputMismatchException();
            }
            if ((!firstArgument.matches(regex) || !secondArgument.matches(regex)) || (!firstArgument.matches(regex) && !secondArgument.matches(regex))){
                return true;
            }
            else {
                return false;
            }
    }

}
