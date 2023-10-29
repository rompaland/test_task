package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float[] myArray1;
        float[] myArray2;
        myArray1 = new float[3];
        myArray2 = new float[200];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter file1 name");
        String nameFile1 = in.nextLine();
        System.out.println("Enter file2 name");
        String nameFile2 = in.nextLine();
        int i = 0;
        File file1 = new File(nameFile1);
        try {
            Scanner scanner = new Scanner(file1);
            while (scanner.hasNextFloat()) {


                myArray1[i] = scanner.nextFloat();
                //System.out.println(myArray1[i]);
                i = i + 1;
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File reading error" + nameFile1);
        }
        float x1 = myArray1[0];
        float y1 = myArray1[1];
        float radius = myArray1[2];


        File file2 = new File(nameFile2);
        int j = 0;
        try {
            Scanner scanner = new Scanner(file2);
            while (scanner.hasNextFloat()) {
                myArray2[j] = scanner.nextFloat();
                // System.out.println(myArray2[j]);
                j = j + 1;
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File reading error" + nameFile2);
        }
        for (int k = 0; k < j / 2; k++) {
            float n1 = myArray2[2*k] - x1;
            float n2 = myArray2[2*k + 1] - y1;
            float x = n1 * n1 + n2 * n2;
            /*
            System.out.println("x2="+myArray2[2*k]);
            System.out.println("y2="+myArray2[2*k + 1]);
            System.out.println("x1="+x1);
            System.out.println("y1="+y1);
            System.out.println(n1);
            System.out.println(n2);
             */
            if (Math.sqrt(x) == radius) {
                System.out.println("0-a point lies on a circle");
            } else if (Math.sqrt(x) < radius) {
                System.out.println("1-point inside");
            } else {
                System.out.println("2-point outside");
            }

        }
    }
}