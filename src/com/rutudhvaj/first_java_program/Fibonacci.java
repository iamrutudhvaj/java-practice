package com.rutudhvaj.first_java_program;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N: ");

        int n = scanner.nextInt();

        int a = 0;
        int b = 1;
        int c = a + b;

        System.out.println(a);
        System.out.println(b);


        while (n >= c) {
            System.out.println(c);
            a = b;
            b = c;
            c = a + b;
        }

    }
}
