package Homework_18_10_2019;

public class HW_9 {

    public static void main(String[] args) {

        int i = 1;
        for (char letter = 'A'; letter <= 'Z'; letter++, i++) {
            if (i % 4 == 0) {

                System.out.println(letter);
            } else {

                System.out.print(letter);
            }

        }
    }
}


