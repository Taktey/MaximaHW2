package Collections_Map_18_03_24;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addContact("Ольга", "123321");
        phoneBook.addContact("Саша", "33333333");
        phoneBook.addContact("Николай", "234234234");
        System.out.println(phoneBook.findNumberByName("Ольга"));
        phoneBook.removeContactByName("Саша");
        System.out.println(phoneBook.findNumberByName("Саша"));
    }
}
