package main.block03.lesson18;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapRunner {

    public static void main(String[] args) {
        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("SMR", "Самара");
        linkedHashMap.put("MSK", "Москва");
        linkedHashMap.put("KZN", "Казань");
        linkedHashMap.put("NSK", "Новосибирск");
        System.out.println(linkedHashMap);

        Map<String, String> treeMap = new TreeMap<>((o1, o2) -> {
            System.out.println("Пустая строка");
            return -1 * o1.compareTo(o2);
        });
        treeMap.putAll(linkedHashMap);
        System.out.println(treeMap);
    }
}