package com.rutudhvaj.first_java_program;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Any Int Number : ");
        int n = scanner.nextInt();

        if (n % 2 == 0) {
            System.out.println("This Number is Even");
        } else {
            System.out.println("This Number is Odd");
        }
    }
}
