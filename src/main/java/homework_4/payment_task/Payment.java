package homework_4.payment_task;

import java.util.ArrayList;
import java.util.List;

public class Payment {
    private List<Product> productList = new ArrayList<>();
    private double totalPrice = 0.0;
    private boolean isPaid = false;

    public Payment() {}

    public void showProducts() {
        if (productList.isEmpty()) {
            System.out.println("Продукты не добавлены.");
        } else {
            productList.forEach(System.out::println);
        }
    }

    public void addProduct(String name, double price) {
        productList.add(new Product(name, price));
        totalPrice += price;
    }

    public double calculateTotal() {
        return totalPrice;
    }

    //добавила сообщение об оплате
    public void makePayment() {
        if (isPaid) {
            System.out.println("Оплата уже произведена.");
        } else {
            System.out.println("Оплата прошла успешно. Спасибо за покупку!");
            isPaid = true;
        }
    }

    public class Product {
        private String name;
        private double price;

        public Product(String name, double price) {
            this.name = name;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Product{" +
                    "name='" + name + '\'' +
                    ", price=" + price +
                    '}';
        }
    }
}

