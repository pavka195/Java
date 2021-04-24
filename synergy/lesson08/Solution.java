package synergy.lesson08;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    // Ограничения - 273,15 C, -459,4 F, 0 K
    public static void main(String[] args) {
        System.out.println("Конвертер температур:");
        System.out.println("---------------------");
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                System.out.print("Введите значение температуры: ");
                double tempInput = Double.parseDouble(br.readLine());
                System.out.println("Выберите конвертер (1-6): ");
                System.out.println("Из Цельсий в Фаренгейт (1):");
                System.out.println("Из Цельсий в Кельвин   (2):");
                System.out.println("Из Фаренгейт в Цельсий (3):");
                System.out.println("Из Фаренгейт в Кельвин (4):");
                System.out.println("Из Кельвин в Цельсий   (5):");
                System.out.println("Из Кельвин в Фаренгейт (6):");
                int select = Integer.parseInt(br.readLine());
                switch (select) {
                    case 1:
                        if (tempInput >= -273.0) {
                            System.out.println("Результат: " + tempInput + " С = " + Converter.getConverter(Temperature.CELLS_FAR).convert(tempInput) + " F");
                        } else {
                            System.out.println("Значение температуры не может быть меньше -273 С");
                        }
                        break;
                    case 2:
                        if (tempInput >= -273.0) {
                            System.out.println("Результат: " + tempInput + " С = " + Converter.getConverter(Temperature.CELLS_KELVIN).convert(tempInput) + " K");
                        } else {
                            System.out.println("Значение температуры не может быть меньше -273 С");
                        }
                        break;
                    case 3:
                        if (tempInput >= -459.4) {
                            System.out.println("Результат: " + tempInput + " F = " + Converter.getConverter(Temperature.FAR_CELLS).convert(tempInput) + " C");
                        } else {
                            System.out.println("Значение температуры не может быть меньше 459.4 F");
                        }
                        break;
                    case 4:
                        if (tempInput >= -459.4) {
                            System.out.println("Результат: " + tempInput + " F = " + Converter.getConverter(Temperature.FAR_KELVIN).convert(tempInput) + " K");
                        } else {
                            System.out.println("Значение температуры не может быть меньше -459.4 F");
                        }
                        break;
                    case 5:
                        if (tempInput >= 0) {
                            System.out.println("Результат: " + tempInput + " K = " + Converter.getConverter(Temperature.KELVIN_CELLS).convert(tempInput) + " C");
                        } else {
                            System.out.println("Значение температуры не может быть меньше 0 K");
                        }
                        break;
                    case 6:
                        if (tempInput >= 0) {
                            System.out.println("Результат: " + tempInput + " K = " + Converter.getConverter(Temperature.KELVIN_FAR).convert(tempInput) + " F");
                        } else {
                            System.out.println("Значение температуры не может быть меньше 0 K");
                        }
                        break;
                    default: System.out.println("Неправильно выбран конвертер");
                        break;
                }
                System.out.print("Закрыть программу? (exit): ");
                if (br.readLine().equals("exit")) {
                    break;
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Введено не корректное значение!");
        }
    }
}