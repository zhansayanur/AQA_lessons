package homework_2;

public class IntArray {
    /*5. Задать целочисленный массив, состоящий из элементов 0 и 1.
    Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия
    заменить 0 на 1, 1 на 0;
    */

    public static void main(String[] args) {
        changeArray();
    }

    public static void changeArray() {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            } else if (array[i] == 0) {
                array[i] = 1;
            }
            System.out.print(array[i] + " ");
        }
    }
}
