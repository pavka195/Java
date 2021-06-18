package main.block02.lesson10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
Подсчитать количество слов в строке, переданной в консоли, а также вывести самые
короткие и длинные слова (если таких кандидатов несколько, то выбрать произвольный).
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        List<String> shortWords = new ArrayList<>();
        List <String> longWords = new ArrayList<>();
        Random random = new Random();
        System.out.println("Введите строку:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split("\\s+");
        Comparator<String> comparator = Comparator.comparingInt(String::length);
        Arrays.sort(str, comparator);
        int shortWordsLength = str[0].length();
        int longWordsLength = str[str.length-1].length();
        for (int s = 0; s < str.length; s++) {
            if (str[s].length() == shortWordsLength)
                shortWords.add(str[s]);
            if (str[s].length() == longWordsLength)
                longWords.add(str[s]);
        }
        System.out.println("Количество слов в строке: " + str.length);
        System.out.println("Количество самых коротких слов: " + shortWords.size() + " кол-во знаков: " + shortWordsLength);
        String randomShortWords = shortWords.get(random.nextInt(shortWords.size()));
        System.out.println("Случайное короткое слово: \"" + randomShortWords + "\"");
        System.out.println("Количество самых длинных слов: " + longWords.size() + " кол-во знаков: " + longWordsLength);
        String randomElementMax = longWords.get(random.nextInt(longWords.size()));
        System.out.println("Случайное длинное слово: \""  + randomElementMax + "\"");
    }
}