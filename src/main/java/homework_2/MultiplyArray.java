package homework_2;

public class MultiplyArray {
    /*7. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
    пройти по нему циклом, и числа меньшие 6 умножить на 2;
    */

    public static void main(String[] args) {
        multiplyElements();
    }

    public static void multiplyElements() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            while (arr[i] < 6) {
                arr[i] *= 2;
            }
            System.out.print(arr[i] + ", ");
        }
        System.out.print("\b\b]");
    }
}
