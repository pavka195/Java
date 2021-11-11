package main.block04.lesson03.good.human;

import main.block04.lesson03.good.Human;


public class Teacher extends Human {
    @Override
    public void read() {
        System.out.println("Я учитель - Я могу читать.");
    }

    public void teach() {
        System.out.println("Я учитель - Я могу учить!");
    }
}

