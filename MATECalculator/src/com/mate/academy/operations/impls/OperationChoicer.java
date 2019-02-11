package com.mate.academy.operations.impls;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OperationChoicer {

    public void getOperation( String operation, String a, String b){
        OperationsImpl operations = new OperationsImpl();
        switch (operation){
            case "+":
                System.out.println("Add result: "+operations.add(a,b));
                break;
            case "-":
                System.out.println("Subtract result: "+operations.subtract(a,b));
                break;
            case "/":
                System.out.println("Divide result: "+operations.divide(a,b));
                break;
            case "*":
                System.out.println("Multiple result: "+operations.multiple(a,b));
                break;
                default:
                    System.out.println("No such operation");
                    try {
                        System.out.println("Try again");
                        Scanner scanner = new Scanner(System.in);
                        System.out.println("Enter operation: ( + ) ( - ) ( / ) ( * )");
                        String op = scanner.next();
                        System.out.println("Enter 1st number ");
                        String fst = scanner.next();
                        System.out.println("Enter 2nd number ");
                        String snd = scanner.next();
                        getOperation(op,fst, snd);
                    }catch (InputMismatchException e){e.getMessage();};
        }
    }
}
