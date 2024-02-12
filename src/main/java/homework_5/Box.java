package homework_5;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> fruitList;
    private float totalWeight;

    public Box() {
        this.fruitList = new ArrayList<>();
        this.totalWeight = 0.0f;
    }

    public void addFruit(T fruit) {
        fruitList.add(fruit);
        totalWeight += (float) fruit.getWeight();
    }

    public float getTotalWeight() {
        return totalWeight;
    }

    //Метод чтобы сравнить вес
    public boolean compare(Box<?> otherBox) {
        return Float.compare(this.getTotalWeight(), otherBox.getTotalWeight()) == 0;
    }

    //Метод чтобы пересыпать фрукты
    public void transferFruitsToAnotherBox(Box<T> otherBox) {
        for (T fruit : fruitList) {
            otherBox.addFruit(fruit);
        }
        fruitList.clear();
        totalWeight = 0.0f;
    }
}