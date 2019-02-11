package com.mate.academy.parser;

import com.mate.academy.constants.ConstValues;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class IntegerParse {
    public static double[] parseToInteger(String[] arr){
        HashMap<String, Double> map = ConstValues.romanValues();
        double fArg = 0;
        double sArg = 0;
        double[] result = new double[2];
        if (map.keySet().contains(arr[0]) && map.keySet().contains(arr[1])){
            Set<Map.Entry<String,Double>> entrySet=map.entrySet();
            for (Map.Entry<String,Double> pair : entrySet){
                if (arr[0].equals(pair.getKey())){
                    fArg = pair.getValue();
                }
                if (arr[1].equals(pair.getKey())){
                    sArg = pair.getValue();
                }
            }
            result[0] = fArg;
            result[1] = sArg;
            return result;
        }
        else return null;
    }
}
