package lesson_3.static_word.block;

import java.util.Date;

public class ClassWithStatic {
    public static void main(String[] args) {
        ClassWithStatic.showDate();
    }
    public static Date date;

    static {
        date = new Date();
        System.out.println("I am block 1");
    }

    static void showDate(){
        System.out.println("Today is: " + date);
    }

    static {
        System.out.println("I am block 2");
    }

    static {
        System.out.println("I am block 3");
    }
}
