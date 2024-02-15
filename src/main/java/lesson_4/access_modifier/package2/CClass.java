package lesson_4.access_modifier.package2;

import lesson_4.access_modifier.package1.AClass;

public class CClass {
    public void printFromAClass(){
        AClass aClass = new AClass();
        System.out.println(aClass.publicString);
//        System.out.println(aClass.privateString);
//        System.out.println(aClass.protectedString); //different package
//        System.out.println(aClass.defaultString); //different package
    }
}
