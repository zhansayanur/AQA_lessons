package homework_2;

public class CheckNegativeBoolean {
    /*3. Написать метод, которому в качестве параметра передается целое число.
    Метод должен вернуть true, если число отрицательное, и вернуть false если
    положительное. Замечание: ноль считаем положительным числом.
    */

    public static boolean isNegativeOrPositive(int a) {
        return a < 0;
    }

    public static void main(String[] args) {
        boolean result = isNegativeOrPositive(0);
        System.out.println(result);
    }
}
