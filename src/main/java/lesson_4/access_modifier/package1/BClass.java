package lesson_4.access_modifier.package1;

public class BClass {
    public void printFromAClass(){
        AClass aClass = new AClass();
        System.out.println(aClass.publicString);
//        System.out.println(aClass.privateString); //no access
        System.out.println(aClass.protectedString); //same package
        System.out.println(aClass.defaultString); //same package
    }
}
