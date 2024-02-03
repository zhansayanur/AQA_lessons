package lesson_2.while_do;

import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert number more than 0");
        int x = scanner.nextInt();

        while (x < 0){
            System.out.println("From while:");
            System.out.println(x);
        }
        do {
            System.out.println("From do while:");
            System.out.println(x);
        }while (x < 0);
    }
}
