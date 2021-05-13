package main.java.synergy.block01.lesson03.task02;

public class Runner {
    /*Вывести в консоль все простые числа от 1 до 1000.
    Простое число — натуральное (целое положительное) число, имеющее ровно
    два различных натуральных делителя — единицу и самого себя.
    */
    public static void main(String[] args) {
        int x, y;
        for (x = 1; x <= 1000; x++) {
            int z = 0;
            for (y = 1; y <= x; y++) {
                if ((x % y) == 0) {
                    z++;
                }
            }
            //Должно быть только 2 натуральных делителя
            if (z > 1 & z < 3)
                System.out.println(x);
        }
    }
}


