package homework_2;

public class CheckSumInRange {
    /*1. Написать метод, принимающий на вход два целых числа и проверяющий,
    что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true,
    в противном случае – false.
     */

    public static boolean returnBoolean(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    public static void main(String[] args) {
        boolean result = returnBoolean(10, 10);
        System.out.println(result);
    }
}
