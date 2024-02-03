package home_work_2;

public class CheckPositiveNegative {
    /*2. Написать метод, которому в качестве параметра передается целое число,
    метод должен напечатать в консоль, положительное ли число передали или отрицательное.
    Замечание: ноль считаем положительным числом.
     */

    public static void printPositiveNegative(int num) {
        if (num >= 0) {
            System.out.println("Число " + num + " является положительным.");
        } else {
            System.out.println("Число " + num + " является отрицательным.");
        }
    }

    public static void main(String[] args) {
        printPositiveNegative(-5);
    }

}
