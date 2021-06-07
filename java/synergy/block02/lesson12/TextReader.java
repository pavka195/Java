package main.java.synergy.block02.lesson12;

import main.java.synergy.block02.lesson11.ExceptionRunner;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;

public class TextReader {

    public static String getContent(String fileName) throws IOException, CustomException {
        URL resource = ExceptionRunner.class.getResource("/" + fileName);
        if (resource != null) {
            try (FileInputStream fileInputStream = new FileInputStream(resource.getFile())) {
                String s = new String();
                return s;
            }
        }
        throw new CustomException(/*"File " + fileName + " isn't found on file system"*/);
    }
}