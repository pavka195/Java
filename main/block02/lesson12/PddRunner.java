package main.block02.lesson12;

public class PddRunner {

    public static void main(String[] args) {

        Kpp kpp = new Kpp();

        Car[] car = new Car[30];
        for (int i=0; i<30; i++) {
            int x = 1 + (int) (Math.random() * 2);
            if (x == 1) {
                car[i] = new PassCar();
            } else {
                car[i] = new CargoCar();
            }
        }

        for (int i=0; i < car.length; i++) {
            try {
                System.out.println("------------------------------------------------------------------------------");
                car[i].speedRun();
                car[i].overelCar(kpp);
                System.out.println("------------------------------------------------------------------------------");
            } catch (MaxSpeed80Exception | MaxSpeed100Exception | WeightException | HeightException | WidthException e) {
                System.out.println(e);
            }
        }
    }
}