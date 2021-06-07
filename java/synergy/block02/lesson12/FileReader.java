package main.java.synergy.block02.lesson12;

import java.io.IOException;

public class FileReader {

    public static String getContent(String fileName) throws IOException {
        if (fileName.endsWith("txt")) {
            try {
                return TextReader.getContent(fileName);
            } catch (CustomException e) {
            }
        } else if (fileName.endsWith("csv")) {
            return CsvReader.getContent(fileName);
        }
        return null;
    }
}