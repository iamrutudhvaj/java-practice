package com.rutudhvaj.first_java_program;

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String name = scanner.next();
        System.out.println("Good Morning!, " + name + ".");
    }
}
