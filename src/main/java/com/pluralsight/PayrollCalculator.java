package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = myScanner.nextLine();
        System.out.print("Enter the amount of hours worked: ");
        float workedHours = myScanner.nextFloat();
        System.out.print("Enter your hourly pay: ");
        float payRate = myScanner.nextFloat();

        System.out.printf("Hello " + name + " gross pay is " + "$%.2f" , workedHours * payRate);
    }
}
