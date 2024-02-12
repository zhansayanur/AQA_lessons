package lesson_5.generics.ex2;

import lesson_3.bearex.Bear;

public class MainPrinterBoth {
    public static void main(String[] args) {
        PrintWithTwoArguments<String, Integer> printer1 = new PrintWithTwoArguments<>("Text", 3333);
        printer1.printBoth();
        System.out.println("=====================");
        PrintWithTwoArguments<Bear, String> printer2 = new PrintWithTwoArguments<>(new Bear("Alex", true), "Hello Generics");
        printer2.printBoth();
    }
}
