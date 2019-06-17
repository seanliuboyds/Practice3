package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int [] average = new int[10];
        Scanner input = new Scanner(System.in);

        int avg = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("\n \n Enter a value: ");
            average[i] = input.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            avg = avg + average[i];
        }
        System.out.print(avg/average.length);
    }
}
