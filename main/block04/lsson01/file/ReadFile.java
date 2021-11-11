package main.block04.lsson01.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    private FileReader fileReader;

    public List<String> readFile(String nameFile) throws IOException {
        List<String> listFile = new ArrayList<>();
        try {
            fileReader = new FileReader(nameFile);
            BufferedReader reader = new BufferedReader(fileReader);
            String line = reader.readLine();
            while (line != null) {
                listFile.add(line);
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            fileReader.close();
        }
        return listFile;
    }
}
