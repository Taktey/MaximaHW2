package Stream_API_19_03_24;

import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 3, 6, 5, 4, 2, 15, 12);
        System.out.println("Задание 3:");
        System.out.println("Сумма = " + list.stream()
                .reduce(0, Integer::sum));
        System.out.println("Среднее = " + (double) (list.stream()
                .reduce(0, Integer::sum) / list.size()));
        System.out.println("Количество больше 10 = " + list.stream()
                .filter(i -> i > 10)
                .count());
    }
}
/*
Задание 3: Агрегация данных
Используя список чисел, выполните следующие задачи:

Найдите сумму всех чисел используя reduce.
Вычислите среднее значение всех чисел.
Выведите количество чисел, больших 10*/
