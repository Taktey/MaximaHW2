package Collections_Map_18_03_24;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Scanner;

@Slf4j
public class FrequencyDictionary {
    public static void main(String[] args) {
        HashMap<String, Integer> dictionary = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String text = sc.nextLine();
        String[] words = text.split("\\s+");
        for (String word : words) {
            if (dictionary.containsKey(word)) {
                dictionary.put(word, (dictionary.get(word) + 1));
            } else {
                dictionary.put(word, 1);
            }
        }
        System.out.println(dictionary);
    }
}
