package homework_4.park_task;

public class MainForPark {
    public static void main(String[] args) {
        Park park = new Park("Парк развлечений", "Центр города");

        Park.Attraction ferrisWheel = new Park.Attraction("Колесо обозрения", "10:00", "20:00", 1.505);
        Park.Attraction rollerCoaster = new Park.Attraction("Американские горки", "11:00", "21:00", 2.705);
        Park.Attraction carousel = new Park.Attraction("Карусель", "09:00", "19:00", 2.205);

        park.addAttraction(ferrisWheel);
        park.addAttraction(rollerCoaster);
        park.addAttraction(carousel);

        for (Park.Attraction attraction : park.attractions) {
            System.out.println("Аттракцион: " + attraction.name);
            System.out.println("Время открытия: " + attraction.getOpeningTime());
            System.out.println("Время закрытия: " + attraction.getClosingTime());
            System.out.println("Цена: " + attraction.getPrice() + Park.CURRENCY);
            System.out.println();
        }
    }
}
