package lesson_5.enums.ex2;

public enum Group {
    TWENTY_ONE_PILOTS("Twenty One Pilots", 40000), ARCTIC_MONKEYS("Arctic Monkeys", 50000), THE_NEIGHBOURHOOD("The Neighbourhood", 75000);

    private String name;
    private int costOfTicket;

    Group(String name, int costOfTicket) {
        this.name = name;
        this.costOfTicket = costOfTicket;
    }

    public String getName() {
        return name;
    }

    public int getCostOfTicket() {
        return costOfTicket;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCostOfTicket(int costOfTicket) {
        this.costOfTicket = costOfTicket;
    }
}
