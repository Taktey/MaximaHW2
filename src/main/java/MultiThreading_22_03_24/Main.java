package MultiThreading_22_03_24;

import lombok.extern.slf4j.Slf4j;

public class Main {
    public static void main(String[] args) {
        StringBuilder string = new StringBuilder("a");

        MyThread firstThread = new MyThread(string);
        MyThread secondThread = new MyThread(string);
        MyThread thirdThread = new MyThread(string);

        firstThread.start();
        secondThread.start();
        thirdThread.start();
    }
}

@Slf4j
class MyThread extends Thread {

    private StringBuilder string;

    public MyThread(StringBuilder string) {
        this.string = string;
    }

    @Override
    public void run() {
        synchronized (string) {
            for (int i = 0; i < 100; i++) {
                log.info("sout from Thread: " + string);
            }
            string.setCharAt(0, (char) (string.charAt(0) + 1));
        }
    }
}



/*
Вывод символа в трех потоках
Необходимо создать три потока, которые изменяют один и тот же объект. Каждый поток должен вывести на экран одну букву 100 раз, и затем увеличить значение символа на 1.

1. Создать класс расширяющий Thread.
2. Переопределить метод run() - здесь будет находиться синхронизированный блок кода.
3. Для того чтобы три объекта потока имели доступ к одному объекту, создаем конструктор принимающий на вход StringBuilder объект.
4. Синхронизированный блок кода будет получать монитор на объект StringBuilder из пункта 3.
5. Внутри синхронизированного блока кода выведите StringBuilder на экран 100 раз, а потом увеличьте значение символа на 1.
6. В методе main() создайте один объект класса StringBuilder, используя символ ‘a’.
7. Затем создайте три экземпляра объекта нашего класса и запустите потоки. */
