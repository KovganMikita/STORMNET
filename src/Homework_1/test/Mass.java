package Homework_1.test;

import java.util.Random;

public class Mass {
    public static void main(String[] args) {
        int[] arrayName;
        arrayName = new int[1];
        for(int i = 0; i < 100;i++);

        //запись типа int[] arrayName=new int[100];
        // это обьявление массива и создание,т.е. выделение памяти для массива на 100 жлементов типа int
        // Обратите внимание: После создания массива с помощью new, в его ячейках записаны значения по умолчанию.
        // Для численных типов (как в нашем примере) это будет 0, для boolean — false, для ссылочных типов — null.
        // Инициализация массива — это заполнение его конкретными данными (не по умолчанию).



        System.out.println(arrayName.length);//вывели в консоль длину массива, то есть количество элементов, которые мы можем поместить в массив

      /*  String[] season = new String[]{"Winter", "Spring", "Summer", "Autumn"};
        for(int i = 0; i < 4; i++)
        System.out.println(season[i]); */
    }


}
