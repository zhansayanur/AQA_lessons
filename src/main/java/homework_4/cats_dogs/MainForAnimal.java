package homework_4.cats_dogs;

public class MainForAnimal {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Барсик", 200, 0),
                new Cat("Мурзик", 250, 0),
                new Cat("Васька", 180, 0)
        };

        Dog[] dogs = {
                new Dog("Шарик", 500, 10),
                new Dog("Бобик", 450, 8),
                new Dog("Тузик", 400, 12)
        };

        Plate plate = new Plate(20);

        for (Cat cat : cats) {
            cat.eat(10);
            cat.run(150); // Пример вызова метода run для кота
        }

        for (Dog dog : dogs) {
            dog.run(300); // Пример вызова метода run для собаки
            dog.swim(5); // Пример вызова метода swim для собаки
        }

        plate.info();
        plate.decreaseFood(15);
        plate.info();
        plate.addFood(30);
        plate.info();
    }
}
