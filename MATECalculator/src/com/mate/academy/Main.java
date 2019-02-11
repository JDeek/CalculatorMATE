package com.mate.academy;
import com.mate.academy.operations.impls.OperationChoicer;


import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        OperationChoicer choicer = new OperationChoicer();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter operation: ( + ), ( - ), ( / ), ( * )");
        String operation = scanner.next();
        System.out.println("Enter 1st number: ");
        String firstArgument = scanner.next();
        System.out.println("Enter 2nd number: ");
        String secondArgument = scanner.next();

        choicer.getOperation(operation, firstArgument, secondArgument);
    }
}
