package synergy.lessons02.task02;

import java.util.Scanner;

public class Runner {
    //Автоматизировать вычисление произвольной математической формулы
    public static void main(String[] args) {
        System.out.println("Расчет квадрата суммы целых чисел");
        System.out.println("---------------------------------");
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Переменная A:");
            int a = scanner.nextInt();
            System.out.println("Переменная B:");
            int b = scanner.nextInt();
            System.out.println("Результат квадрата суммы:");
            long c = (long) a * a + 2L * a * b + (long) b * b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println("Введено не целое число");
        }

        System.out.println("Расчет куба суммы вещественных чисел");
        System.out.println("---------------------------------");
        try {
            System.out.println("Переменная X:");
            double x = scanner.nextDouble();
            System.out.println("Переменная Y:");
            double y = scanner.nextDouble();
            System.out.println("Результат куб суммы:");
            double z = x * x * x + 3 * x * x * y + 3 * x * y * y + y * y * y;
            System.out.println(z);
        } catch (Exception e) {
            System.out.println("Введено не вещественное число" + e);
        }
    }
}
