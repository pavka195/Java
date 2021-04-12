package synergy.lesson03.task01;

import java.util.Scanner;

public class Runner {
    /*
    Первая задача:
    Пользователь вводит в консоль коэффициенты a, b, c квадратного уравнения (a*x^2 + b*x + c = 0).
    Решением является вывод на экран корней этого уравнения.
    При этом:
    - если первый коэффициент a равен нулю, то вывести «Первый коэффициент не может быть 0».
    - если уравнение не имеет корней, то вывести «Нет действительных решений уравнения».
    - если уравнение имеет два корня, то вывести их в строку через пробел (для одного корня, достаточно одного значения).
    */
    public static void main(String[] args) {
        double a, b, c, d = 0;
        double x1, x2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Решение квадратного уравнения: a*x^2 + b*x + c = 0");
        System.out.println("--------------------------------------------------");
        try {
            System.out.print("Коэффициент A: ");
            a = scanner.nextDouble();
            if (a != 0) {
                System.out.print("Коэффициент B: ");
                b = scanner.nextDouble();
                System.out.print("Коэффициент C: ");
                c = scanner.nextDouble();
                d = b * b - 4 * a * c; //Формула дискриминанта
                if (d < 0) {
                    System.out.println("Нет действительных решений уравнения");
                } else if (d == 0) {
                    x1 = -b / (2 * a); //Корень уравнения если Дискриминант равен 0
                    System.out.println("Корни уравнения: " + x1);
                } else {
                    x1 = (-b - Math.sqrt(d)) / (2 * a);  //Корень уравнения если Дискриминант > 0
                    x2 = (-b + Math.sqrt(d)) / (2 * a);  //Корень уравнения если Дискриминант > 0
                    System.out.println("Корни уравнения: " + x1 + " " + x2);
                }
            } else {
                System.out.println("Первый коэффициент не может быть 0");
            }
        } catch (Exception e) {
            System.out.println("Введено не корректное значение!");
        }
    }
}