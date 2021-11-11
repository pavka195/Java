package main.block04.lsson01.database;

import java.util.ArrayList;
import java.util.List;

public class Poem {
    public static List<String> getPoem() {
        List<String> poemList = new ArrayList<>();
        poemList.add("Последняя туча рассеянной бури!");
        poemList.add("Одна ты несешься по ясной лазури,");
        poemList.add("Одна ты наводишь унылую тень,");
        poemList.add("Одна ты печалишь ликующий день.");
        poemList.add("Ты небо недавно кругом облегала,");
        poemList.add("И молния грозно тебя обвивала;");
        poemList.add("И ты издавала таинственный гром");
        poemList.add("И алчную землю поила дождем.");
        poemList.add("Довольно, сокройся! Пора миновалась,");
        poemList.add("Земля освежилась, и буря промчалась,");
        poemList.add("И ветер, лаская листочки древес,");
        poemList.add("Тебя с успокоенных гонит небес.");
        return poemList;
    }
}