package Homework_18_10_2019;

public class HW_4_2 {
    public static void main(String[] args) {

        int n = (12);

        n = n % 7;

        switch (n) {
            case 0:
                System.out.println("Воскресенье");
                break;
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            default:
                System.out.println("Выйди в окно");

        }
    }
}
//

