package lesson_2.array;

import java.util.Arrays;
import java.util.Random;

public class ArrayInitWithForCycle {
    public static void main(String[] args) {
        int[] arrayInt = new int[5];
        System.out.println(arrayInt.length);

        for (int i = 0; i < arrayInt.length; i ++){
            arrayInt[i] = (i + 1) * 10;
        }
        System.out.println(Arrays.toString(arrayInt));

        Random randomizer = new Random();
        int randomInt = randomizer.nextInt(-100, 100);
        System.out.println(randomInt);

        int[] arrayInt2 = new int[5];
        System.out.println(arrayInt2.length);

        for (int i = 0; i < arrayInt2.length; i ++){
            arrayInt2[i] = randomizer.nextInt(-100, 100);
        }
        System.out.println(Arrays.toString(arrayInt2));

        for (int i = 0; i < arrayInt2.length; i ++){
            System.out.print(arrayInt2[i] + ", ");
        }
        System.out.println("\b\b");
    }
}
