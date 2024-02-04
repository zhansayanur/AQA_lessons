package homework_2;

import java.util.Arrays;

public class ArrayShift {
    /* *** Написать метод, которому на вход подается одномерный массив
    и число n (может быть положительным, или отрицательным), при этом
    метод должен сместить все элементы массива на n позиций. Элементы
    смещаются циклично. Для усложнения задачи нельзя пользоваться
    вспомогательными массивами. Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо)
    -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
    При каком n в какую сторону сдвиг можете выбирать сами.
    */

    public static void main(String[] args) {
        int[] arrayCheck = {1, 2, 3};
        System.out.println(checkBalance(arrayCheck));
        stepArray(arrayCheck, 1);
    }

    public static boolean checkBalance(int[] arr) {
        int start = 0;
        int end;
        boolean bool = false;
        for (int i = 0; i < arr.length; i++) {
            start = start + arr[i];
            end = 0;
            if (bool != true) {
                for (int j = arr.length - 1; j > i; j--) {
                    end = end + arr[j];
                }
                if (start == end) {
                    bool = true;
                }
            }
        }
        return bool;
    }

    public static void stepArray(int[] arr, int n) {
        int size = arr.length;
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                int first = arr[size - 1];
                for (int j = size - 1; j > 0; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[0] = first;
            }
        }
        if (n < 0){
            n = n * -1;
            for (int i = size; i > n; i--) {
                int first = arr[size - 1];
                for (int j = size - 1; j > 0; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[0] = first;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

