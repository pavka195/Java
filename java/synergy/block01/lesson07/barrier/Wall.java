package main.java.synergy.block01.lesson07.barrier;

import main.java.synergy.block01.lesson07.sportsman.Sportsman;

public class Wall extends Barrier{
    private final int wallHeight;

    public Wall(String name, int wallHeight) {
        super(name);
        this.wallHeight = wallHeight;
    }

    @Override
    public boolean action(Sportsman sportsman) {
        System.out.println("Высота барьера \"" + super.getName() + "\" составляет: " + this.wallHeight + " м.");
        //Спортсмен прыгает и мы проверяем, преодолел ли он барьер
        sportsman.jump();
        if (this.wallHeight <= sportsman.wallHeight()) {
            System.out.println(sportsman.nameSportsman() + " успешно преодолел барьер!");
            return true;
        } else {
            System.out.println(sportsman.nameSportsman() + " не смог преодолеть барьер...");
            return false;
        }
    }
}