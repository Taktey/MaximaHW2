package Lists_15_03_24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("Apple", "Banana", "Orange", "Pineapple", "Pear"));
        ArrayList<String> vegetables = new ArrayList<>(Arrays.asList("Tomato", "Carrot", "Potato", "Cucumber", "Eggplant"));
        LinkedList<String> products = new LinkedList<>();
        products.addAll(fruits);
        products.addAll(vegetables);
        System.out.println("Список содержит все фрукты " + products.containsAll(fruits));
        System.out.println("Список содержит все овощии " + products.containsAll(vegetables));
        products.removeAll(vegetables);
        System.out.println(products);
        //Далее- задание с книгами
        BookShelf bookShelf = new BookShelf();
        bookShelf.addBook("Bible");
        bookShelf.addBook("Пикник на обочине");
        bookShelf.addBook("Ложная слепота");
        bookShelf.removeBook("Bible");
        bookShelf.listBooks();
    }
}
