package homework_5;

public class Main {
    public static void main(String[] args) {
        Box<Apple> appleBox1 = new Box<>();
        Box<Apple> appleBox2 = new Box<>();
        Box<Orange> orangeBox = new Box<>();

        appleBox1.addFruit(new Apple());
        appleBox1.addFruit(new Apple());

        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());

        System.out.println("Apple box 1 weight: " + appleBox1.getTotalWeight());
        System.out.println("Apple box 2 weight: " + appleBox2.getTotalWeight());
        System.out.println("Orange box weight: " + orangeBox.getTotalWeight());

        System.out.println("=============");

        System.out.println("Compare apple box 1 and orange box: " + appleBox1.compare(orangeBox));

        System.out.println("=============");

        appleBox1.transferFruitsToAnotherBox(appleBox2);

        System.out.println("Apple box 1 weight after transfer: " + appleBox1.getTotalWeight());
        System.out.println("Apple box 2 weight after transfer: " + appleBox2.getTotalWeight());
    }
}
