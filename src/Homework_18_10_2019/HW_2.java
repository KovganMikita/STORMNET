package Homework_18_10_2019;

import java.util.Scanner;

public class HW_2 {

    public static void main(String[] args) {

        int x = 2;
        Scanner scan = new Scanner(System.in);
        x = scan.nextInt();
        System.out.println(x);


        if ((x % 2) == 0) {
            System.out.println("Число является чётным");

        } else System.out.println("Вы ввели не чётное число");


    }

}
//