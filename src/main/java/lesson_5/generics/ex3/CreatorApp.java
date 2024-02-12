package lesson_5.generics.ex3;

public class CreatorApp {
    public static void main(String[] args) {
        GenericHuman<Human> human = new GenericHuman<>(new Human("Matt"));
        human.sayInfoAboutThisInstance();

        GenericHuman<Elf> elf = new GenericHuman<>(new Elf("Friren"));
        elf.sayInfoAboutThisInstance();
    }
}
