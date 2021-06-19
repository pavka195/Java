package main.block02.lesson11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import static main.block02.lesson11.Calculator.divide;

public class ExceptionRunner {

    public static void main(String[] args) {
        try (FileInputStream fileInputStream = new FileInputStream(ExceptionRunner.class.getResource("/Test.txt").getFile())) {
            print("");
            int v = divide(25, 0);
            Integer max = null;
            int zero = max;
        } catch (ArithmeticException | NullPointerException | IllegalArgumentException e) {
            e.printStackTrace();
            System.out.println("Запрещено деление на 0");
        } catch (RuntimeException e) {

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Файл не найден");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Исключение случается");
        } catch (Throwable th) {
            th.printStackTrace();
            System.out.println("Проблема случается");
        } finally {
            System.out.println("Важная информация");
        }
        System.out.println("Привет, мир!");
    }

    public static void print(String str) {
        System.out.println(str);
    }
}