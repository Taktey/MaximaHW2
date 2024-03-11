package Exception_IO_05_03_24.calc;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HW_Part1 {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        System.out.println(task1(30, 4));
        System.out.println("Задание 2");
        System.out.println(task2());
    }

    public static double task1(int a, int b) {
        double result = 0.0;
        try {
            result = (double) a / (double) b;
        } catch (ArithmeticException e) {
            System.out.println(e + "\nИзбегайте деления на 0");
        } finally {
            System.out.println("Операция деления завершена");
        }
        return result;
    }

    public static int task2() {
        boolean isAdditionalInputRequires = true;
        int userInput = 0;
        while (isAdditionalInputRequires) {
            System.out.println("Введите целое число:");
            try(Scanner sc = new Scanner(System.in)) {
                userInput = sc.nextInt();
                isAdditionalInputRequires = false;
            } catch (InputMismatchException e) {
                System.out.println(e + "\nНекорректный ввод, ожидается целое число");
            }
        }
        return userInput * 2;
    }
}
