package com.rutudhvaj.first_java_program;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please Enter Name: ");
        String name = scanner.next();

        StringBuilder sb = new StringBuilder(name);
        sb.reverse();
        String temp = sb.toString();

        System.out.println("name :" + name);
        System.out.println("temp :" + temp);

//        TODO: Why this == operator is not working
//        System.out.println(name == temp);

        if (name.equals(temp)) {
            System.out.println("This Name is Palindrome");
        } else {
            System.out.println("This Name is not Palindrome");
        }
    }
}
