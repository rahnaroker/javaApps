package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n = 0;
        try {

            Scanner scan = new Scanner(System.in);
            System.out.println("Write massive's length: ");
            n = scan.nextInt();
            int[]mass = new int[n];

            for ( int i = 0; i < n; i++) {
                System.out.println("Write next value: ");
                mass[i] = scan.nextInt();
            }

        } catch (InputMismatchException e) {
            System.out.println("Wrong data type");
        }

    }


}
