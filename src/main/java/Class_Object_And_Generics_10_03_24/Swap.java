package Class_Object_And_Generics_10_03_24;

import java.util.ArrayList;
import java.util.List;

public class Swap {
    public static void main(String[] args) {
        List<Integer> listInteger = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
        List<String> listString = List.of("one", "two", "three", "four", "five");
        List<Integer> newIntegerList = swap(listInteger, 3, 4);
        List<String> newStringList = swap(listString, 1, 3);
        System.out.println(newIntegerList);
        System.out.println(newStringList);

    }

    static <T> List<T> swap(List<T> list, int firstIndex, int secondIndex) {
        List<T> result = new ArrayList<>(List.of());
        if (firstIndex > secondIndex) {
            int swapVar = firstIndex;
            firstIndex = secondIndex;
            secondIndex = swapVar;
        }
        for (int i = 0; i < list.size(); i++) {
            if (i != firstIndex && i != secondIndex) {
                result.add(list.get(i));
            } else if (i == firstIndex) {
                result.add(list.get(secondIndex));
            } else if (i == secondIndex) {
                result.add(list.get(firstIndex));
            }
        }
        return result;
    }
}
