package lesson_4.final_word;

public class ChildClass extends ParentClass{
//    public final class ChildClass extends ParentClass{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void forOverload(){
        System.out.println("I am child");
    }

//    public final void doSmth(){
//        System.out.println("i am final method");
//    }
}
