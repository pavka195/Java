package main.block03.lesson21.logger;

import lombok.Getter;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

@Getter //используем геттеры
public class Logger {
    private final static Map<Integer, String> mapLevel = new TreeMap<>();
    private final static Map<Integer, String> mapMsg = new TreeMap<>();
    private static FileOutputStream fos;
    public final static String fileName = "C:/test/result.txt";
    private static BufferedReader reader;

    static {
        mapLevel.put(0, "TRACE");
        mapLevel.put(1, "DEBUG");
        mapLevel.put(2, "INFO");
        mapLevel.put(3, "WARN");
        mapLevel.put(4, "ERROR");
        mapLevel.put(5, "FATAL");
        mapMsg.put(0, "Регистрируем сообщение на уровне TRACE");
        mapMsg.put(1, "Регистрируем сообщение на уровне DEBUG");
        mapMsg.put(2, "Регистрируем сообщение на уровне INFO");
        mapMsg.put(3, "Регистрируем сообщение на уровне WARN");
        mapMsg.put(4, "Регистрируем сообщение на уровне ERROR");
        mapMsg.put(5, "Регистрируем сообщение на уровне FATAL");
        try {
            fos = new FileOutputStream(fileName, true);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private Date date;
    private String level;
    private String nameThread;
    private String msg;


    public void setDate(Date date) {
        this.date = date;
    }

    public void setLevel(int log) {
        if (mapLevel.containsKey(log)) {
            this.level = mapLevel.get(log);
        }
    }

    public void setNameThread(String nameThread) {
        this.nameThread = nameThread;
    }

    public void setMsg(int numMsg) {
        if (mapMsg.containsKey(numMsg)) {
            this.msg = mapMsg.get(numMsg);
        }
    }

    public void writeToFile() throws IOException {
        String msgToFile = "Текущее время: " + getDate() + ", Статус: " + getLevel() +
                " Поток №: " + Thread.currentThread().getName() + ", Сообщение: " + getMsg() + "\r\n";
        fos.write(msgToFile.getBytes(StandardCharsets.UTF_8));
    }

    public void writeToConsole() {
        String msg2 = "Текущее время: " + getDate() + ", Статус: " + getLevel() +
                " Поток №: " + Thread.currentThread().getName() + ", Сообщение: " + getMsg() + "\r\n";
        System.out.println(msg2);
    }

    public static void printToConsole() throws IOException {
        try {
            reader = new BufferedReader(new FileReader(Logger.fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String msg;
        while ((msg = reader.readLine()) != null) {
            System.out.println(msg);
        }
    }
}