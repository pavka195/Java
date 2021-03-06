package main.block03.lesson16;

import main.block03.lesson16.setWork.Employee;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SetRunner {
    public static void main(String[] args) {
        Set<Employee> employeeSet = new TreeSet<>(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getWorkAge().compareTo(o2.getWorkAge()) * -1;
            }
        });
        employeeSet.add(new Employee("Лосев", new BigDecimal(1)));
        employeeSet.add(new Employee("Морозов", new BigDecimal(2)));
        employeeSet.add(new Employee("Кузнецов", new BigDecimal(3)));
        employeeSet.add(new Employee("Смирнов", new BigDecimal(4)));
        employeeSet.add(new Employee("Иванов", new BigDecimal(5)));
        employeeSet.add(new Employee("Панов", new BigDecimal(6)));
        employeeSet.add(new Employee("Маслов", new BigDecimal(7)));
        employeeSet.add(new Employee("Тощенко", new BigDecimal(8)));
        employeeSet.add(new Employee("Бочкарев", new BigDecimal(9)));
        employeeSet.add(new Employee("Гусева", new BigDecimal(10)));

        System.out.println("Вывод по убыванию стажа: " + employeeSet); //прямой вывод по стажу

        Random random = new Random(100);
        Set<Integer> intSet = new TreeSet<>();
        for (int i = 0; i < 100; i++) {
            intSet.add(random.nextInt(150));
        }

        Set<Integer> intSet2 = new TreeSet<>();
        for (int i = 0; i < 100; i++) {
            intSet2.add(random.nextInt(150));
        }
        print("Объединение множеств: ", union(intSet, intSet2));
        print("Пересечения множеств: ", intersact(intSet, intSet2));
    }

    private static void print(String string, Set<Integer> set) {
        if (set.size() != 0) {
            System.out.print(string + " - ");
            for (Integer currentElement : set) {
                System.out.print(currentElement + " ");
            }
            System.out.println(".");
        }
    }

    private static Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> unionSet = new TreeSet<>();
        unionSet.addAll(set1);
        unionSet.addAll(set2);
        return unionSet;
    }

    private static Set<Integer> intersact(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> intersactSet = new TreeSet<>();
        intersactSet.addAll(set1);
        intersactSet.retainAll(set2);
        return intersactSet;
    }
}