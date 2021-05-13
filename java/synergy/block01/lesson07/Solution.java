package main.java.synergy.block01.lesson07;

import main.java.synergy.block01.lesson07.barrier.Barrier;
import main.java.synergy.block01.lesson07.barrier.Track;
import main.java.synergy.block01.lesson07.barrier.Wall;
import main.java.synergy.block01.lesson07.sportsman.Cat;
import main.java.synergy.block01.lesson07.sportsman.Human;
import main.java.synergy.block01.lesson07.sportsman.Robot;
import main.java.synergy.block01.lesson07.sportsman.Sportsman;

import java.util.Random;

public class Solution {
    public static void main(String[] args) {
        //Создадим массив объектов спортсменов, так как нельзя наследоваться, создадим интерфейс
        Sportsman[] sportsman = new Sportsman[9];
        //Создадим несколько разных объектов спортсменов с рандомными параметрами
        Random random = new Random();
        sportsman[0] = new Human("Павел", random.nextInt(50), random.nextInt(15));
        sportsman[1] = new Human("Мария", random.nextInt(50), random.nextInt(15));
        sportsman[2] = new Human("Алена", random.nextInt(50), random.nextInt(15));
        sportsman[3] = new Cat("Персик", random.nextInt(50), random.nextInt(15));
        sportsman[4] = new Cat("Макс", random.nextInt(50), random.nextInt(15));
        sportsman[5] = new Cat("Томик", random.nextInt(50), random.nextInt(15));
        sportsman[6] = new Robot("Xiaomi01", random.nextInt(50), random.nextInt(15));
        sportsman[7] = new Robot("Xiaomi02", random.nextInt(50), random.nextInt(15));
        sportsman[8] = new Robot("Xiaomi03", random.nextInt(50), random.nextInt(15));
        //Создадим массив объектов барьеров, через массив базового класса
        Barrier[] barrier = new Barrier[9];
        barrier[0] = new Track("1", 10);
        barrier[1] = new Wall("1", 2);
        barrier[2] = new Track("2", 20);
        barrier[3] = new Wall("2", 5);
        barrier[4] = new Track("3", 30);
        barrier[5] = new Wall("3", 10);
        barrier[6] = new Track("4", 40);
        barrier[7] = new Wall("4", 15);
        barrier[8] = new Track("5", 50);
        //Запускаем каждого спортсмена через препятствия
        for (Sportsman value : sportsman) {
            boolean winner = true;
            for (Barrier item : barrier) {
                winner = item.action(value);
                if (!winner) {
                    break;
                }
            }
            if (winner) {
                System.out.println("Спортсмен " + value.nameSportsman() + " преодолел все препятствия!!!");
            } else {
                System.out.println("Спортсмен " + value.nameSportsman() + " сошел с дистанции...");
            }
            System.out.println();
        }
    }
}
