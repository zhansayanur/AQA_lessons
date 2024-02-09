package lesson_3.static_word.block;

public class StaticBlockExample {
    public static void main(String[] args) {
        StaticBlockExample.methodStart();
        StaticBlockExample staticBlockExample = new StaticBlockExample();
        StaticBlockExample staticBlockExample2 = new StaticBlockExample();
    }

    static {
        //always!!! runs one time
        System.out.println("I am static block!!!");
    }

    public static void methodStart() {
        System.out.println("I am start method!!!");
    }
}
