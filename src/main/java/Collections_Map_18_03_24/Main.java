package Collections_Map_18_03_24;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addContact("Ольга", "123321");
        phoneBook.addContact("Саша", "33333333");
        phoneBook.addContact("Николай", "234234234");
        log.info(phoneBook.findNumberByName("Ольга"));
        phoneBook.removeContactByName("Саша");
        log.info(phoneBook.findNumberByName("Саша"));
    }
}
