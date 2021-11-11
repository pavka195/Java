package main.block04.lsson01;

import main.block04.lsson01.database.Poem;
import main.block04.lsson01.file.ReadFile;
import main.block04.lsson01.file.WriteFile;

import java.io.IOException;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        WriteFile writeFile = new WriteFile();
        ReadFile readFile = new ReadFile();
        List<String> listPoem = Poem.getPoem();
        String nameFile = "D:\\test\\poem.txt";
        String nameFileLine = "D:\\test\\poemTemp";
        //Сохраним в файл все строки
        writeFile.write(listPoem, nameFile);
        //Прочитаем из файла все строки
        List<String> listFile = readFile.readFile(nameFile);
        //Каждую строчку сохраним в отдельных файлах
        for (int i = 0; i < listFile.size(); i++) {
            writeFile.writeLine(listFile.get(i),nameFileLine + i + ".txt");
        }
    }
}