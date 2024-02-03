package lesson_2.array;

import java.util.Random;

public class ForEach {
    public static void main(String[] args) {
        Random randomizer = new Random();
        int[] arrayInt2 = new int[5];
        //for
        for (int i = 0; i < arrayInt2.length; i ++){
            arrayInt2[i] = randomizer.nextInt(-50, 50);
        }

        //for each
        for (int number: arrayInt2){
            System.out.print(number + ", ");
        }
        System.out.println("\b\b");
    }
}
