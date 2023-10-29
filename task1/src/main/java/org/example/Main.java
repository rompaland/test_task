package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input length and interval");
        int n = in.nextInt();
        int m = in.nextInt();
        int[] roundArray;
        int d = 1;
        roundArray = new int[n];
        for (int i = 0; i < n; i++){
            roundArray[i] = i+1;
        }
        do{
            System.out.print(d);
            d = d + m-1;
            if(d > n) {
                d = d % n;
            }
        }
        while (d != 1);
    }
}