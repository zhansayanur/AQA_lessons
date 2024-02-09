package lesson_4.interfaces.part2;

public class CrossFitMan implements Sportable{
    private String name;

    public CrossFitMan(String name) {
        this.name = name;
    }

    @Override
    public void doSport() {
        System.out.println("Я люблю кроссфит. Мое имя " + name + ".");
    }
}
