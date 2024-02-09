package homework_4.payment_task;

public class Main {
    public static void main(String[] args) {
        Payment payment = new Payment();

        payment.addProduct("Ноутбук", 500.244);
        payment.addProduct("Планшет", 200.258);
        payment.addProduct("Плестейшн", 300.556);
        payment.addProduct("Телефон", 200.666);

        payment.showProducts();

        //калькулятор общей суммы
        double total = payment.calculateTotal();
        System.out.println("Общая сумма к оплате: " + total);

        payment.makePayment();
    }
}
