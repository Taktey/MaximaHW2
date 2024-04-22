package Stream_API_19_03_24.Task2;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class Main {
    public static void main(String[] args) {
        List<Book> list = List.of(
                new Book("Игра престолов", 1996),
                new Book("Битва королей", 1998),
                new Book("Буря мечей", 2000),
                new Book("Пир стервятников", 2005),
                new Book("Танец с драконами", 2011)
        );
        List<String> newList = list.stream()
                .filter(book -> book.getYear() > 2000)
                .map(Book::getName)
                .toList();
        log.info("Задание 2\n" + newList);

    }
}

/*Задание 2: Преобразование списка объектов
Создайте класс Book с полями name (название книги) и year (год издания). Создайте список книг. Используя Stream API:

Преобразуйте список книг в список строк, содержащий названия книг, изданных после 2000 года.
Выведите полученный список названий на экран.*/
