package com.rutudhvaj.first_java_program;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter N1 : ");
        int n1 = scanner.nextInt();
        int n1Arm = 0;
        int n1Length = 0;
        int tempN1 = n1;
        boolean isN1Arm = false;

        System.out.print("Enter N2 : ");
        int n2 = scanner.nextInt();
        int n2Arm = 0;
        int n2Length = 0;
        int tempN2 = n2;
        boolean isN2Arm = false;

        // N1 Armstrong Calculation
        while (tempN1 != 0) {
            tempN1 = tempN1 / 10;
            n1Length++;
        }

        tempN1 = n1;

        while (tempN1 != 0) {
            int reminder = tempN1 % 10;
            n1Arm = (int) (n1Arm + Math.pow(reminder, n1Length));
            tempN1 = tempN1 / 10;
        }

        if (n1Arm == n1) {
            isN1Arm = true;
        }

        // N2 Armstrong Calculation
        while (tempN2 != 0) {
            tempN2 = tempN2 / 10;
            n2Length++;
        }

        tempN2 = n2;

        while (tempN2 != 0) {
            int reminder = tempN2 % 10;
            n2Arm = (int) (n2Arm + Math.pow(reminder, n2Length));
            tempN2 = tempN2 / 10;
        }

        if (n2Arm == n2) {
            isN2Arm = true;
        }


        if (isN1Arm && isN2Arm) {
            System.out.println(n1 + " ," + n2 + " both are Armstrong Numbers.");
        } else if (isN1Arm) {
            System.out.println(n1 + " is Armstrong Number.");
        } else if (isN2Arm) {
            System.out.println(n2 + " is Armstrong Number.");
        } else {
            System.out.println(n1 + " ," + n2 + " both are not Armstrong Numbers.");
        }
    }
}
