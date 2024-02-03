package homework_2;

public class LeapYear {
    /* *Написать метод, который определяет, является ли год високосным,
    и возвращает boolean (високосный - true, не високосный - false).
    Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый
    400-й – високосный.
    */

    public static void main(String[] args) {
        boolean isLeapYear = isLeapYear(2024);
        System.out.println(isLeapYear);
    }

    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
}
