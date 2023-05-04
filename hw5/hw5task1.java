package javahw.hw5;

import java.security.KeyException;
import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.stream.Collectors;

import javax.management.ValueExp;

import org.w3c.dom.NameList;

public class hw5task1 {
    // Написать программу, которая найдёт и
    // выведет повторяющиеся имена с количеством
    // повторений. Отсортировать по убыванию
    // популярности.
    public static void main(String[] args) {

        fillNameList();
    }

    public static void fillNameList() {
        HashMap<String, String> PhoneBook = new HashMap<>();
        HashMap<String, Integer> sortedNames = new HashMap<>();
        PhoneBook.put("17482", "Иван");
        PhoneBook.put("85938", "Светлана");
        PhoneBook.put("04928", "Кристина");
        PhoneBook.put("93847", "Анна");
        PhoneBook.put("84932", "Анна");
        PhoneBook.put("48937", "Иван");
        PhoneBook.put("389372", "Петр");
        PhoneBook.put("393283", "Павел");
        PhoneBook.put("847362", "Петр");
        PhoneBook.put("9384623", "Мария");
        PhoneBook.put("999837", "Марина");
        PhoneBook.put("84893", "Мария");
        PhoneBook.put("938472", "Мария");
        PhoneBook.put("3938272", "Марина");
        PhoneBook.put("393084", "Анна");
        PhoneBook.put("4928947", "Иван");
        PhoneBook.put("489372", "Петр");
        PhoneBook.put("398473", "Иван");

        for (var el : PhoneBook.entrySet()) {
            String currentValue = el.getValue();
            if (sortedNames.containsKey(currentValue)) {
                Integer count = sortedNames.get(currentValue) + 1;
                sortedNames.put(currentValue, count);
            } else {
                sortedNames.put(currentValue, 1);
            }
        }

        // TreeMap<String, Integer> sortedMap = new TreeMap<>(sortedNames);
        // //отсортировал по ключам по алфавиту
        // // Лист отсортировал только значения не перенимая ключи:
        // List<Integer> sortedList = new ArrayList<>(sortedNames.values());
        // Collections.sort(sortedList);
        HashMap<String, Integer> newMap = new HashMap<>();

        newMap = sortedNames.entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(Collectors
                        .toMap(Map.Entry::getKey,
                                Map.Entry::getValue,
                                (e1, e2) -> e1,
                                LinkedHashMap::new));

        System.out.println(sortedNames);

        System.out.println(newMap);

    }
}
