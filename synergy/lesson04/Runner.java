package synergy.lesson04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;

public class Runner {

    public static void main(String[] args) {
        BigInteger[] massFibonacci = new BigInteger[2];
        massFibonacci[0] = BigInteger.valueOf(0); // Первое значение
        massFibonacci[1] = BigInteger.valueOf(1); // Второе значение
        System.out.println("Вывести n-ый член последовательности Фибоначчи");
        System.out.println("----------------------------------------------");
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                System.out.print("Вычисление значения числа Фибоначчи: ");
                int numFibonacci = Integer.parseInt(br.readLine());
                if (numFibonacci < 0) {
                    System.out.println("Введено не корректное значение!");
                } else {
                    //Если массив меньше чем необходимо, то мы его увеличиваем
                    if (massFibonacci.length <= numFibonacci) {
                        int massLengthOld = massFibonacci.length; // старый размер массива
                        massFibonacci = Arrays.copyOf(massFibonacci, fibonacci(numFibonacci + 1).length);
                        for (int i = massLengthOld; i <= numFibonacci; i++) {
                            //каждое последующее число равно сумме двух предыдущих чисел
                            massFibonacci[i] = massFibonacci[i - 2].add(massFibonacci[i - 1]);
                        }
                    }
                    System.out.println("Значение введенного числа Фибоначчи: " + massFibonacci[numFibonacci]);
                }
                System.out.print("Завершить вычисления? (exit): ");
                if (br.readLine().equals("exit")) {
                    break;
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Введено не целое число!");
        }
    }

    //Метод возвращает массив большего размера
    public static BigInteger[] fibonacci(int numUserFibonacci) {
        BigInteger[] massUserFibonacci = new BigInteger[numUserFibonacci];
        return massUserFibonacci;
    }
}