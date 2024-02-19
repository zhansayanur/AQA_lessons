package homework_7.telephone_directory;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneBook {
    private Map<String, Set<String>> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    public void add(String lastName, String phoneNumber) {
        Set<String> numbers = phoneBook.getOrDefault(lastName, new HashSet<>());
        numbers.add(phoneNumber);
        phoneBook.put(lastName, numbers);
    }

    public Set<String> get(String lastName) {
        return phoneBook.getOrDefault(lastName, new HashSet<>());
    }
}
