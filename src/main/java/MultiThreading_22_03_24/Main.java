package MultiThreading_22_03_24;

public class Main {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder('a');

        MyThread thread1 = new MyThread(stringBuilder);
        MyThread thread2 = new MyThread(stringBuilder);
        MyThread thread3 = new MyThread(stringBuilder);
    }

}

class MyThread extends Thread {
    private char value;
    public MyThread(StringBuilder letter){
        value = letter.charAt(0);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(value);
        }
        value= (char)((int)value+1);
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
