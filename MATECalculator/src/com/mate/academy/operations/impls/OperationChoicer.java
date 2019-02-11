package com.mate.academy.operations.impls;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OperationChoicer {

    public void getOperation( String operation, String firstArgument, String secondArgument){
        OperationsImpl operations = new OperationsImpl();
        switch (operation){
            case "+":
                System.out.println("Add result: "+operations.add(firstArgument,secondArgument));
                break;
            case "-":
                System.out.println("Subtract result: "+operations.subtract(firstArgument,secondArgument));
                break;
            case "/":
                System.out.println("Divide result: "+operations.divide(firstArgument,secondArgument));
                break;
            case "*":
                System.out.println("Multiple result: "+operations.multiple(firstArgument,secondArgument));
                break;
                default:
                    System.out.println("No such operation");
                    try {
                        System.out.println("Try again");
                        Scanner scanner = new Scanner(System.in);
                        System.out.println("Enter operation: ( + ) ( - ) ( / ) ( * )");
                        String againOperation = scanner.next();
                        System.out.println("Enter 1st number ");
                        String fstArgument = scanner.next();
                        System.out.println("Enter 2nd number ");
                        String sndArgument = scanner.next();
                        getOperation(againOperation,fstArgument, sndArgument);
                    }catch (InputMismatchException e){e.getMessage();};
        }
    }
}
