package Homework_18_10_2019;

import java.util.Scanner;

public class HW_3 {


    public static void main(String[] args) {

        int a;
        int b;
        int r;

        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        b = scan.nextInt();
        r = scan.nextInt();

        if ((r * r) / 2 >= (a * a + b * b) / 2) {
            System.out.println("DA");

        } else {
            System.out.println("Net");

        }
    }

}
//