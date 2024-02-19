package homework_7.telephone_directory;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Иванов", "+7 777 548 5454");
        phoneBook.add("Петров", "+7 123 456 7890");
        phoneBook.add("Иванов", "+7 456 789 0123");
        phoneBook.add("Сериков", "+7 789 012 3456");

        System.out.println("Номера телефонов для фамилии Иванов: " + phoneBook.get("Иванов"));
        System.out.println("Номера телефонов для фамилии Петров: " + phoneBook.get("Петров"));
        System.out.println("Номера телефонов для фамилии Сериков: " + phoneBook.get("Сериков"));
        System.out.println("Номера телефонов для фамилии Новиков: " + phoneBook.get("Новиков"));
    }
}
