package lesson_5.generics.ex3;

public abstract class Humanable {
    protected String name;
    protected Type type;

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public Humanable(String name) {
        this.name = name;
    }

    protected abstract void sayWhoAmI();
}
