package Project_patterns_01_03_24.calc;

public class Calculator {
    public static void main(String[] args) {
        System.out.println(mult(5, 6));
        System.out.println(div(15, 3));
        System.out.println(subtraction(15, 3));
        System.out.println(sum(15, 3));
        System.out.println(sum(15, new int[]{1, 2, 3}));
        System.out.println(sum(15, new int[]{1, 2, 3, 4, 5, 6}));

    }

    public static int mult(int a, int b) {
        return a * b;
    }

    public static double div(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        } else return Double.POSITIVE_INFINITY;
    }

    public static int subtraction(int a, int b) {
        return a - b;
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int[] array) {
        int res = 0;
        for (int i : array) {
            res = sum(res, i);
        }
        return res;
    }

    public static int sum(int a, int... others) {
        int res = a;
        for (int i : others) {
            res = sum(res, i);
        }
        return res;
    }
}
