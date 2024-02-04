package homework_2;

public class PrintArray {
    /*9.* Написать метод, принимающий на вход два аргумента:
    len и initialValue, и возвращающий одномерный массив типа int
    длиной len, каждая ячейка которого равна initialValue;
    */

    public static void main(String[] args) {
        int[] resultArray = createArray(5, 10);
        for (int i =0; i < resultArray.length; i++) {
            System.out.print(resultArray[i] + " ");
        }
    }

    public static int[] createArray(int len, int initialValue) {
        int[] arr = new int[len];

        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }

        return arr;
    }
}
