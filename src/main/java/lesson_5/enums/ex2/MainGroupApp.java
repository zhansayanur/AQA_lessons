package lesson_5.enums.ex2;

public class MainGroupApp {
    public static void main(String[] args) {
        PersonHuman[] personHuman = {
                new PersonHuman("Ilyas", 30000),
                new PersonHuman("Yana", 70000),
                new PersonHuman("Asya", 80000),
        };

        for (PersonHuman person : personHuman) {
            person.whichGroupCanVisit();
        }
    }
}