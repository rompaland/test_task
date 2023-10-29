package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] nums;
        nums = new int[100];
        int avrgValue;
        int i;
        i = 0;
        int summa;
        summa = 0;
        int numberOfSteps;
        numberOfSteps = 0;
        int k;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter file name");
        String nameFile = in.nextLine();
        File file = new File(nameFile);
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextInt()) {


                nums[i] = scanner.nextInt();
                summa = summa + nums[i];
                i = i + 1;
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File reading error" + nameFile);
        }
        if((summa & i) < 0.5){
            avrgValue = summa / i;
            System.out.println(avrgValue);
        }else {
            avrgValue = (summa / i) + 1;
            System.out.println(avrgValue);
        }
        for (int j = 0; j < i; j++){
            k = Math.abs(avrgValue - nums[j]);
            System.out.println(k);
            numberOfSteps = numberOfSteps + k;
        }
        System.out.println("minimum number of moves_"+numberOfSteps);
        }

    }
