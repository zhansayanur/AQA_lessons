package lesson_3.oop;

public class Main {
    public static void main(String[] args) {
        Recipe saltedWater = new Recipe();
        saltedWater.getInfo();
        System.out.println(saltedWater.timeToCook);
        saltedWater.title = "Water with salt";
        saltedWater.price = 10;
        saltedWater.getInfo();
    }
}
