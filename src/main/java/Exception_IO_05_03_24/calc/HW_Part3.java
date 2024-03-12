package Exception_IO_05_03_24.calc;

import java.io.*;
import java.util.Scanner;

public class HW_Part3 {
    public static void main(String[] args) {
        String sourcePath = "src/main/java/Exception_IO_05_03_24/calc/Source.txt";
        String targetPath = "src/main/java/Exception_IO_05_03_24/calc/Target.txt";
        copyFileContent(sourcePath, targetPath);

    }

    public static void copyFileContent(String sourcePath, String targetPath) {
        StringBuilder string = new StringBuilder(); //Создаем объект StringBuilder для формирования строки изи файла
        try (Scanner sc = new Scanner(new File(sourcePath))) { //Вызываем сканнер в качестве ресурса, передаем новый файл с путем к Source.txt
            while (sc.hasNextLine()) { //Если есть следующая строка- будем её считывать
                string.append(sc.nextLine() + "\n"); //Считываем строку из файла, добавляем её к нашему объекту StringBuilder
            }
        } catch (FileNotFoundException e) { //Ловим исключение
            System.out.printf(e.getMessage() + "\nФайл %s не найден, проверьте путь к файлу Source.txt", sourcePath);
        }
        try (FileWriter writer = new FileWriter(new File(targetPath));) {
            writer.write(String.valueOf(string)); //Записываем содержимое объекта StringBuilder в Target.txt
        } catch (IOException e) {//Ловим исключение
            System.out.println(e.getMessage() + "\nОшибка записи в файл Target.txt");
        }
    }
}
