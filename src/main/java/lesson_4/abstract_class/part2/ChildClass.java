package lesson_4.abstract_class.part2;

public class ChildClass extends AbstractClass implements Inter1, Inter2{

    @Override
    void fromAbstractClass() {
        System.out.println("Logic1");
    }

    @Override
    public void inter1() {
        System.out.println("Logic2");
    }

    @Override
    public void inter2() {
        System.out.println("Logic3");
    }

    @Override
    public void doSmth() {
        System.out.println("Logic4");
    }
}
