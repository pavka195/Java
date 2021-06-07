package main.java.synergy.block02.lesson12;

import java.io.IOException;

import static main.java.synergy.block02.lesson12.FileReader.getContent;

public class ReaderLauncher {

    public static void main(String[] args) /*throws Exception*/ {
        try {
            String content = getContent("test1.txt");
            System.out.println(content);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("File is unavailable");
        }
    }
}
