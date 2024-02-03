package lesson_2;

public class StringClassExample {
    public static void main(String[] args) {
        String text = new String("Hello world!!!");

        String text2 = "Hello world!!!";
        System.out.println(text2);
        String text3 = text2 + " Hello again!";
        System.out.println(text3);
        //==
        boolean result = text2.equals(text3);
        System.out.println(result);

    }
}
