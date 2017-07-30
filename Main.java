package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n = 0;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Write massive's length: ");
            n = scan.nextInt();
            Integer[]arr = new Integer[n];
            for ( int i = 0; i < n; i++) {
                System.out.println("Write next value: ");
                arr[i] = scan.nextInt();
            }
            BubbleSorter.sort(arr);
            System.out.print("Sorted array: ");
            for (Integer i : arr ) {
                System.out.print(i + " ");
            }
        } catch (InputMismatchException e) {
            System.out.println("Wrong data type");
        }
    }
}
