package Class_Object_And_Generics_10_03_24;

import java.util.List;

public class imitations {
    public static void main(String[] args) {
        List<Double> listDouble = List.of(1.5, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0);
        List<Integer> listInteger = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        System.out.println(sumOfList(listInteger));
        System.out.println(sumOfList(listDouble));
    }

    static double sumOfList(List<? extends Number> list) {
        Double result = 0.0;
        for (Number number : list) {
            result += number.doubleValue();
        }
        return result;
    }
}
