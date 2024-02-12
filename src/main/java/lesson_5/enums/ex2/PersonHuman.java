package lesson_5.enums.ex2;

public class PersonHuman {
    private String name;
    private int money;

    public String getName(){
        return name;
    }

    public PersonHuman(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void whichGroupCanVisit(){
        if (money < Group.TWENTY_ONE_PILOTS.getCostOfTicket()) {
            System.out.println(getName() + ", you stay at home and cry lol.");
        } else if (money < Group.ARCTIC_MONKEYS.getCostOfTicket() && money >= Group.TWENTY_ONE_PILOTS.getCostOfTicket()) {
            System.out.println(getName() + ", you can go to " + Group.TWENTY_ONE_PILOTS.getName() + ".");
        } else if (money < Group.THE_NEIGHBOURHOOD.getCostOfTicket() && money >= Group.ARCTIC_MONKEYS.getCostOfTicket()) {
            System.out.println(getName() + ", you can go to " + Group.ARCTIC_MONKEYS.getName() + ".");
        } else {
            System.out.println(getName() + ", you can go wherever you wish!");
        }
    }
}
