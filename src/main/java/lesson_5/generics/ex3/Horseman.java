package lesson_5.generics.ex3;

public class Horseman extends Humanable{
    public Horseman(String name) {
        super(name);
        this.type = Type.HORSEMAN;
    }

    @Override
    public String toString() {
        return "Horseman{" +
                "name='" + name + '\'' +
                ", type=" + type +
                '}';
    }

    @Override
    protected void sayWhoAmI() {
        System.out.println("My name is " + name + ", I am " + type);
    }
}
