package lesson_5.generics.ex3;

public class Human extends Humanable{
    public Human(String name) {
        super(name);
        this.type = Type.HUMAN;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", type=" + type +
                '}';
    }

    @Override
    protected void sayWhoAmI() {
        System.out.println("My name is " + name + ", I am " + type);
    }
}
