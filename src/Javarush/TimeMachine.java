package Javarush;


public class TimeMachine {


       public void goToFuture(int currentYear){

            currentYear = currentYear + 10;
        }
        public void gotoPast(int currentYear){

            System.out.println("Метод goToPast начал работы!");
            System.out.println("Значение currentYear внутри метода goToPast (в начале) = " + currentYear);
            currentYear = currentYear - 10;
            System.out.println("Значение currentYear внутри метода goToPast (в конце) = " + currentYear);
        }

        public static void main(String[] args) {

            TimeMachine timeMachine = new TimeMachine();
            int currenYear = 2019;

            System.out.println("Какой год в самом начале работы программы?");
            System.out.println(currenYear);

            timeMachine.gotoPast(currenYear);
            System.out.println("А сейчас какой год?");
            System.out.println(currenYear);

        }
    }

