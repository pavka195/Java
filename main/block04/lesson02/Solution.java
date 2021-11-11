package main.block04.lesson02;

import javax.swing.text.html.ImageView;
import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Path;

public class Solution {
    public static void main(String[] args) throws IOException, URISyntaxException {
        URL url = new URL("https://news.mail.ru/politics/47752916/?frommail=1&exp_id=828");
        //Метод openConnection предназначен для создания канала между приложением и сетевым ресурсом,
        // представленным объектом класса URL
        URLConnection connection = url.openConnection();

        System.out.println("URL: " + url);
        System.out.println("Протокол: " + url.getProtocol());
        System.out.println("Имя хоста: " + url.getHost());
        System.out.println("Путь URL: " + url.getPath());
        System.out.println("Имя файла: " + url.getFile());
        System.out.println("Часть запроса URL: " + url.getQuery());
        System.out.println("Порт по умолчанию: " + url.getDefaultPort());
        System.out.println("Порт: " + url.getPort());
        System.out.println("Ссылка: " + url.getRef());
        System.out.println("Содержимое странички:");
        //Прочитаем данные странички
        try (InputStream input = connection.getInputStream();
             BufferedReader reader = new BufferedReader(new InputStreamReader(input))) {
            while (reader.ready())
                System.out.println(reader.readLine());
        }
        //Сохраним фото из интернет ресурса на диск
        String image = "https://retina.news.mail.ru/prev780x440/pic/ae/cd/image47752916_2dc8d29f454fc503b623dfbe73fbc66d.jpg";
        URL urlJpg = new URL(image);
        InputStream inputJpg = urlJpg.openStream();

        Path path = Path.of("C:\\primer.jpg");
        Files.copy(inputJpg, path);

        URI uri = new URI("https://news.mail.ru:80/politics/47752916/?frommail=1&exp_id=828");
        System.out.println("URI: " + uri);
        System.out.println("Имя хоста: " + uri.getHost());
        System.out.println("Запрос URI: " + uri.getQuery());
        System.out.println("Путь URI: " + uri.getPath());
        System.out.println("Часть запроса URI: " + uri.getQuery());
        System.out.println("Полномочия указанного URI: " + uri.getAuthority());
        System.out.println("Порт по умолчанию: " + uri.toURL().getDefaultPort());
        System.out.println("Схема: " + uri.getScheme());
        System.out.println("Порт: " + uri.getPort());

    }
}