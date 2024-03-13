package Class_Object_And_Generics_10_03_24;

import java.util.ArrayList;

public class Storage<T> {
    int index = 10;
    ArrayList<T> storage = new ArrayList<T>();

    void add(T item) {
        storage.add(item);
    }

    T get(int index) {
        try {
            return storage.get(index);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e + "\nИспользуйте значения в промежутке от 0 до " + (storage.size() - 1));
        }
        return null;
    }

    int size() {
        return storage.size() - 1;
    }
}
