package synergy.lessons03.task03;

import java.util.Scanner;

public class Runner {
    /*
    Используя только арифметические операции сложения и вычитания,
    вычислить квадратный корень из целого числа. В данном случае,
    корень из числа должен извлекаться без бесконечных дробей
    (допустимы для ввода числа 1, 4, 9, 16 и т.д.,
    в противном случае - сообщать в консоль, что вычислить корень указанного числа невозможно).
    Проверить, что результат корректен, т.е. при умножении его на
    самого себя должно получиться введенное значение.
     */
    public static void main(String[] args) {
        System.out.println("Вычислить квадратный корень из целого числа");
        System.out.println("-------------------------------------------");
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Квадратный корень числа: ");
            int number = scanner.nextInt(); //вычислить корень целого числа
            int count = 0; // значение вычисления
            int border = 0;
            if (number > 0) {
                while (border < number) {
                    count += 1;
                    border += 2 * count - 1;
                }
                if (count * count == number) {
                    System.out.println("Корень введенного числа: " + count);
                } else {
                    System.out.println("Вычислить корень указанного числа невозможно!");
                }
            } else {
                System.out.println("Введено не корректное значение!");
            }
        } catch (Exception e) {
            System.out.println("Введено не целое число!");
        }
    }
}