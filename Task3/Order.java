package Task3;

import java.util.List;

public class Order {

    private String id;
    private double price;

    public Order (String id, double price) {
        this.id = id;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public static void printOrders(List<Order> orders){
        for (Order order : orders) {
            System.out.println("Order id : " + order.getId());
            System.out.println("Order price : " + order.getPrice());
            System.out.println();
        }
    }
}
