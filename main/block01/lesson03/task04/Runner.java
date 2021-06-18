package main.block01.lesson03.task04;

import java.math.BigInteger;
import java.util.Scanner;

public class Runner {
    /*
    Вывести n-ый член последовательности Фибоначчи, где число n запрашивается в консоли у пользователя.
     */
    public static void main(String[] args) {
        System.out.println("Вывести n-ый член последовательности Фибоначчи");
        System.out.println("----------------------------------------------");
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Вычисление значения числа Фибоначчи: ");
            int a = scanner.nextInt();
            BigInteger[] fib = new BigInteger[3];
            fib[0] = BigInteger.valueOf(0); // Первое значение
            fib[1] = BigInteger.valueOf(1); // Второе значение
            if (a < 0) {
                System.out.println("Введено не корректное значение!");
            } else {
                if (a == 0) {
                    System.out.println("Значение введенного числа Фибоначчи: " + fib[0]);
                } else if (a == 1) {
                    System.out.println("Значение введенного числа Фибоначчи: " + fib[1]);
                } else {
                    for (int i = 2; i <= a; ++i) {
                        fib[2] = fib[0].add(fib[1]); //каждое последующее число равно сумме двух предыдущих чисел
                        fib[0] = fib[1];
                        fib[1] = fib[2];
                    }
                    System.out.println("Значение введенного числа Фибоначчи: " + fib[2]);
                }
            }
        } catch (Exception e) {
            System.out.println("Введено не целое число!");
        }
    }
}