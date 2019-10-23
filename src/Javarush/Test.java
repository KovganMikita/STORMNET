package Javarush;

public class Test{


    public void goToFuture(int currentYear){

        currentYear = currentYear + 10;
    }
    public void gotoPast(int currentYear){



        currentYear = currentYear - 10;
        System.out.println( + currentYear);
    }

    public static void main(String[] args) {

        Test timeMachine = new Test();
        int currenYear = 2019;

        System.out.println("Какой год в самом начале работы программы?");
        System.out.println(currenYear);

        timeMachine.gotoPast(currenYear);
        System.out.println("А сейчас какой год?");
        System.out.println(currenYear);

    }
}

