package lesson_3.equals_hash_code;

public class Main {
    //only name
    public static void main(String[] args) {
        Auto renault = new Auto("Renault", 145645000, false);
        Auto renault2 = new Auto("Renault", 10000, true);
        System.out.println(renault.equals(renault2));
        System.out.println(renault.hashCode());
        System.out.println(renault2.hashCode());
        System.out.println(renault);
        System.out.println(renault2);
    }
}
