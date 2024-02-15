package homework_4.cats_dogs;

class Cat extends Animal {
    private boolean isHungry;

    public Cat(String name, int runLimit, int swimLimit) {
        super(name, runLimit, swimLimit);
        isHungry = true;
    }

    public void eat(int amount) {
        if (isHungry) {
            System.out.println(name + " покушал " + amount + " еды.");
            isHungry = false;
        } else {
            System.out.println(name + " уже сыт.");
        }
    }
}