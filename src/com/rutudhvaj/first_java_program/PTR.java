package com.rutudhvaj.first_java_program;

import java.util.Scanner;

public class PTR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Principal Value: ");
        double p = scanner.nextDouble();
        System.out.print("Enter Time in Year: ");
        double t = scanner.nextDouble();
        System.out.print("Enter Rate per Year: ");
        double r = scanner.nextDouble();

        double i = (p * r * t) / 100;

        System.out.println("i = " + i);
    }
}
