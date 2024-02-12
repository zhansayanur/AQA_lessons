package lesson_5.generics.ex4;

import lesson_3.bearex.Bear;
import lesson_5.generics.ex3.*;

public class GenericMethodClass {
    public static void main(String[] args) {
        printWhatever(new Human("Sam"));
        printWhateverTwoArguments(new Human("Dan"), new Bear("Max", true));
        printOnlyHumanable(new Hobbit("Tyler"));
        printGenericInstanceWildCart(new GenericHuman<>(new Human("Sean")));
        printGenericInstanceWildCart(new GenericHuman<>(new Hobbit("Pimon")));
        printGenericInstanceElf(new GenericHuman<>(new Elf("Craft")));
    }
    public static <T> void printWhatever(T x) {
        System.out.println(x);
    }

    public static <T, M> void printWhateverTwoArguments(T first, M second) {
        System.out.println(first);
        System.out.println(second);
    }

    public static <T extends Humanable> void printOnlyHumanable(T humanable) {
        System.out.println(humanable);
    }

    public static void printGenericInstanceWildCart(GenericHuman<?> human) {
        System.out.println(human);
    }

    public static void printGenericInstanceElf(GenericHuman<Elf> human) {
        System.out.println(human);
    }
}
