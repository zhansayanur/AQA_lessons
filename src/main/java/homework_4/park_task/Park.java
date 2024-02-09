package homework_4.park_task;

import java.util.ArrayList;
import java.util.List;

public class Park {
    public static final String CURRENCY = " тг";

    public String name;
    private String location;

    public List<Attraction> attractions;

    public Park(String name, String location) {
        this.name = name;
        this.location = location;
        this.attractions = new ArrayList<>();
    }

    public double getAttractionCost(Attraction attraction) {
        if (attraction != null) {
            return attraction.getPrice();
        } else {
            return 0;
        }
    }

    public void addAttraction(Attraction attraction) {
        attractions.add(attraction);
    }

    public void removeAttraction(Attraction attraction) {
        attractions.remove(attraction);
    }

    public static class Attraction {
        public String name;
        private String openingTime;
        private String closingTime;
        private double price;

        public Attraction(String name, String openingTime, String closingTime, double price) {
            this.name = name;
            this.openingTime = openingTime;
            this.closingTime = closingTime;
            this.price = price;
        }

        public String getOpeningTime() {
            return openingTime;
        }

        public String getClosingTime() {
            return closingTime;
        }

        public double getPrice() {
            return price;
        }
    }
}
