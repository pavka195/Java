package main.block03.lesson17.map;

import main.block03.lesson16.set.dto.Car;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class MapRunner {
    public static void main(String[] args) {
        Map<Integer, String> cityDictionary = new HashMap<>();
        cityDictionary.put(77, "Москва");
        cityDictionary.put(78, "Санкт-Петербург");
        cityDictionary.put(92, "Севастополь");
        cityDictionary.put(71, "Тульская область");
        cityDictionary.put(73, "Ульяновская область");
        cityDictionary.put(-1, null);

        for (Map.Entry<Integer, String> entry : cityDictionary.entrySet()) {
            System.out.println("Ключ: " + entry.getKey() + " Стоимость : " + entry.getValue());
        }

        System.out.println(cityDictionary.get(78));

        if (cityDictionary.containsKey(16)) {
            System.out.println(cityDictionary.get(16));
        }


        Map<Car, BigDecimal> cars = new HashMap<>();
        Car rapid = new Car("Skoda").setModel("Rapid");
        cars.put(rapid, new BigDecimal("1200000"));
        cars.put(new Car("Lada").setModel("12"), new BigDecimal("100000"));
        cars.put(new Car("Suzuki").setModel("Grand Vitara"), new BigDecimal("2000000"));

        System.out.println(cars.get(rapid));
        System.out.println(cars.get(new Car("Volkswagen")));

        cars.remove(rapid);
        System.out.println(cars);

        System.out.println(cars.containsValue(new BigDecimal("100000")));
        System.out.println(cars.size());
    }
}
