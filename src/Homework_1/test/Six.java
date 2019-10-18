package Homework_1.test;

import java.util.SortedMap;

public class Six {
    public static void main(String[] args) {
        // 1*2*3*4*5*6 = 720
        //1*2*3*4*5*6 = это мой fac
        // 1*1 = 1 это мой result (первый цикл)
        //1*2 = 2 это мой result (второй цикл)
        //2*3 = 6 это мой result (третий цикл)
        //6*4 = 24 это мой result (четвёртый цикл)
        //24*5 = 120 это мой result (пятый цикл)
        //120*6 = 720 это мой result (второй цикл)

        int fac = 1;
        int result = 1;

        while (fac <= 6) {

            result = result * fac;
            System.out.println(result);
            fac++;
        }
    }
}

