package lesson_3.oop;

import java.util.Arrays;

public class Recipe {
    public String title;
    public int price;
    public boolean isVegan;
    public double timeToCook;

    public String[] listOfIngredients;

    public void getInfo(){
        System.out.println("Title of dish is: " + title);
        System.out.println("Price: " + price + "tg");
        System.out.println("List of Ingredients: " + Arrays.toString(listOfIngredients));
    }
}
