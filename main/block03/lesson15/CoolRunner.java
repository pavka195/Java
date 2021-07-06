package main.block03.lesson15;

import main.block03.lesson15.work.CoolEmployee;
import main.block03.lesson15.work.Employee;

import java.util.*;

public class CoolRunner {

    public static void main(String[] args) {
        Employee losev = new Employee("Лосев", 1);
        Employee morozov = new Employee("Морозов", 2);
        Employee kuznetsov = new Employee("Кузнецов", 3);
        Employee smirnov = new Employee("Смирнов", 4);
        Employee ivanov = new Employee("Иванов", 5);
        Employee panov = new Employee("Панов", 6);
        Employee maslov = new Employee("Маслов", 7);
        Employee toshchenko = new Employee("Тощенко", 8);
        Employee bochkarev = new Employee("Бочкарев", 9);
        Employee guseva = new Employee("Гусева", 10);

        List<Employee> employeesList = new ArrayList<>();
        employeesList.add(losev);
        employeesList.add(morozov);
        employeesList.add(kuznetsov);
        employeesList.add(smirnov);
        employeesList.add(ivanov);
        employeesList.add(panov);
        employeesList.add(maslov);
        employeesList.add(toshchenko);
        employeesList.add(bochkarev);
        employeesList.add(guseva);

        //вывод массива в принципе
        System.out.println(employeesList.toString());

        //рандом для определения стажа.
        Random rand = new Random();
        int min = 0;
        int max = 10;
        int x = min + rand.nextInt(max - min + 1);

        //вывод имени при совпадении стажа работы
        CoolEmployee coolEmployee = new CoolEmployee();
        CoolEmployee.printEmployee(employeesList, x);

        //удаление всех нечетных записей двигаясь с конца
        boolean odd = false;
        for (ListIterator iterator = employeesList.listIterator(employeesList.size()); iterator.hasPrevious(); odd = !odd) {
            iterator.previous();
            if (odd) {
                iterator.remove();
            }
        }
        System.out.println(employeesList);
    }
}