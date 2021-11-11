package main.block04.lsson01.file;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteFile {
    private FileWriter fileWriter;

    public void write(List<String> list, String nameFile) throws IOException {
        try {
            fileWriter = new FileWriter(nameFile);
            for (int i = 0; i < list.size(); i++) {
                fileWriter.write(list.get(i));
                if (i < list.size() - 1) {
                    fileWriter.write(System.getProperty("line.separator"));
                }
            }
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            fileWriter.close();
        }
    }

    public void writeLine(String line, String nameFile) throws IOException {
        try {
            fileWriter = new FileWriter(nameFile);
            fileWriter.write(line);
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            fileWriter.close();
        }
    }
}