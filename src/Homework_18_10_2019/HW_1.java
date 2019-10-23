package Homework_18_10_2019;

import java.util.Scanner;

public class HW_1 {
    public static void main(String[] args) {

        int number;
        Scanner scan = new Scanner(System.in);
        number = scan.nextInt();
        System.out.println(number);


        if (number == 7) {
            System.out.println("Число является семеркой");
        } else System.out.println("Введеное число не является семеркой");
    }
}
//
