package com.mate.academy.operations.impls;

import com.mate.academy.operations.Operations;
import com.mate.academy.parser.IntegerParse;


import java.util.InputMismatchException;


public class OperationsImpl implements Operations {
    @Override
    public double add(String a, String b) {
        try {
           if (romaNumCheck(a,b)){
               String[] arr = new String[2];
               arr[0] = a;
               arr[1] = b;
               double[] readyInt = IntegerParse.parseToInteger(arr);
               return readyInt[0] + readyInt[1];
           }
           else {
               return Double.parseDouble(a) + Double.parseDouble(b);
           }
        }catch (InputMismatchException e){
            e.getMessage();
        }
        return 0;
    }

    @Override
    public double subtract(String a, String b) {
        try {
            if (romaNumCheck(a,b)){
                String[] arr = new String[2];
                arr[0] = a;
                arr[1] = b;
                double[] readyInt = IntegerParse.parseToInteger(arr);
                return readyInt[0] - readyInt[1];
            }
            else {
                return Double.parseDouble(a) - Double.parseDouble(b);
            }
        }catch (InputMismatchException e){
            e.getMessage();
        }
        return 0;
    }

    @Override
    public double divide(String a, String b) {
        try {
            if (romaNumCheck(a,b)){
                String[] arr = new String[2];
                arr[0] = a;
                arr[1] = b;
                double[] readyInt = IntegerParse.parseToInteger(arr);
                return readyInt[0] / readyInt[1];
            }
            else {
                return Double.parseDouble(a) / Double.parseDouble(b);
            }
        }catch (InputMismatchException e){
            e.getMessage();
        }
        return 0;
    }

    @Override
    public double multiple(String a, String b) {
        try {
            if (romaNumCheck(a,b)){
                String[] arr = new String[2];
                arr[0] = a;
                arr[1] = b;
                double[] readyInt = IntegerParse.parseToInteger(arr);
                return readyInt[0] * readyInt[1];
            }
            else {
                return Double.parseDouble(a) * Double.parseDouble(b);
            }
        }catch (InputMismatchException e){
            e.getMessage();
        }
        return 0;
    }

    private  boolean romaNumCheck(String a, String b){
        String regex = "\\d+";
            if ((!a.matches(regex) || !b.matches(regex)) || (!a.matches(regex) && !b.matches(regex))){
                return true;
            }
            else {
                return false;
            }
    }

}
