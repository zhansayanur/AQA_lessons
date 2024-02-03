package homework_2;

public class TypeString {
    /*4. Написать метод, которому в качестве аргументов передается строка и число,
    метод должен отпечатать в консоль указанную строку, указанное количество раз;
    */
    public static void main(String[] args) {
        printStringMultipleTimes("Hello, World!", 5);
    }

    public static void printStringMultipleTimes(String str, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(str);
        }
    }
}
