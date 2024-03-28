package Collections_Map_18_03_24;

import java.util.HashMap;

public class PhoneBook {
    HashMap<String, String> map = new HashMap<>();

    public void addContact(String name, String phoneNumber) {
        map.put(name, phoneNumber);
    }

    public String findNumberByName(String name) {
        return map.getOrDefault(name, "Контакт не найден");
    }

    public void removeContactByName(String name) {
        map.remove(name);
    }

}
