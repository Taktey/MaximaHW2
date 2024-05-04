package Stream_API_19_03_24;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class Task3 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 3, 6, 5, 4, 2, 15, 12);
       log.info("Задание 3:");
        log.info("Сумма = " + list.stream()
                .reduce(0, Integer::sum));
        log.info("Среднее = " + (double) (list.stream()
                .reduce(0, Integer::sum) / list.size()));
        log.info("Количество больше 10 = " + list.stream()
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
