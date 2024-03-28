package Stream_API_19_03_24;
import java.util.List;


public class Task1 {
    public static void main(String[] args) {
        List<String> list = List.of("От",
                "Топота",
                "Копыт",
                "Пыль",
                "По",
                "Полю",
                "Летит",
                "Это",
                "Такая",
                "Старинная",
                "Скороговорка");
        List<String> filterFiveCharacters = list.stream()
                .filter(string -> string.length() > 5).sorted((e, k) -> -e.compareTo(k)).toList();
        System.out.println("Задание 1\n" + filterFiveCharacters);
    }
}
/*
Задание 1: Фильтрация и сортировка
Создайте список строк. Необходимо:
        Отфильтровать строки, длина которых больше 5 символов.
Отсортировать полученный список строк в обратном алфавитном порядке.
Вывести результат на экран..*/
