package homework_4.cats_dogs;

class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int amount) {
        if (food >= amount) {
            food -= amount;
        } else {
            System.out.println("В тарелке недостаточно еды.");
        }
    }

    public void addFood(int amount) {
        food += amount;
        System.out.println("В тарелку добавлено " + amount + " еды.");
    }

    public void info() {
        System.out.println("В тарелке осталось " + food + " еды.");
    }
}
