package main.block04.lesson03.good;

import main.block04.lesson03.good.human.Teacher;

public class HumanTeacher extends Teacher {

    @Override
    public void read() {
        System.out.println("Я профессор - Я могу читать.");
    }

    public void teach() {
        System.out.println("Я профессор - Я могу учить.");
    }
}
