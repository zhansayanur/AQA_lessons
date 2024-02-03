package lesson_2.conditional.ternar;

import java.util.Scanner;

public class TernarExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        String message = age > 18 ? "You are adult" : "You are not adult";
        System.out.println(message);
        scanner.close();
    }
}
