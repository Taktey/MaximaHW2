package Stream_API_19_03_24.Task2;

public class Book {
    public Book(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    private String name;
    private int year;
}
