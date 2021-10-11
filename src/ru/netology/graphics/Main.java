package ru.netology.graphics;

import ru.netology.graphics.image.TextGraphicsConverter;
import ru.netology.graphics.server.GServer;

import java.io.File;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        TextGraphicsConverter converter = new TextGraphicks(); // Создайте тут объект вашего класса конвертера
        converter.convert("https://r.mt.ru/r4/photoE60B/20985799249-0/jpg/bp.webp");
        converter.setMaxHeight(671);
        converter.setMaxWidth(671);
        converter.setMaxRatio(1.1);
        GServer server = new GServer(converter); // Создаём объект сервера
        server.start(); // Запускаем

        // Или то же, но с сохранением в файл:
        /*
        PrintWriter fileWriter = new PrintWriter(new File("converted-image.txt"));
        converter.setMaxWidth(200);
        converter.setMaxHeight(300);
        fileWriter.write(converter.convert("https://i.ibb.co/6DYM05G/edu0.jpg"));
        fileWriter.close();
        */
    }
}
