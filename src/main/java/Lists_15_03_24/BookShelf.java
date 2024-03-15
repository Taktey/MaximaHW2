package Lists_15_03_24;

import java.util.ArrayList;

public class BookShelf {
    private ArrayList<String> books;

    public BookShelf(){
        books = new ArrayList<>();
    }
    public void addBook(String bookName){
        books.add(bookName);
    }
    public void removeBook(String bookName){
        books.remove(bookName);
    }
    public void listBooks(){
        System.out.println(books);
    }

}
