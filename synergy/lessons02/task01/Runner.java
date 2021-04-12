package synergy.lessons02.task01;

public class Runner {
    //Выполнить элементарные арифметические операции с целыми и вещественными числами
    public static void main(String[] args) {
        int x = 12;
        int y = 24;
        int z = x + y;
        System.out.println("x = " + x + " , y = " + y + " , z = " + z);
        z = z * 25;
        System.out.println("x = " + x + " , y = " + y + " , z = " + z);
        z = z - y;
        System.out.println("x = " + x + " , y = " + y + " , z = " + z);
        z = z / y; //Результат деления целого числа на целое – это всегда целое число, остаток при делении отбрасывается
        System.out.println("x = " + x + " , y = " + y + " , z = " + z);

        double a = 123.456;
        double b = 98.765;
        double c = a * b * 12.345;
        System.out.println("a = " + a + " , b = " + b + " , c = " + c);
        c = a + b;
        System.out.println("a = " + a + " , b = " + b + " , c = " + c);
        b = b - c;
        System.out.println("a = " + a + " , b = " + b + " , c = " + c);
        a = c / b;
        System.out.println("a = " + a + " , b = " + b + " , c = " + c);
    }
}