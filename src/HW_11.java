package Homework_18_10_2019;

import java.util.Random;

public class HW_11 {
    public static void main(String[] args) {

        Random random = new Random();

        int[] arrayName = new int[100];

        for (int i = 0; i < arrayName.length; i++) {
            arrayName[i] = random.nextInt(100);
            System.out.println(arrayName[i]);
        }


    }
}




