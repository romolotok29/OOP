package Task3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static Task3.Order.printOrders;

public class Main {
    public static void main(String [] args) {

        List<Order> orders = new ArrayList<>();

        Order order1 = new Order("123", 135.49);
        Order order2 = new Order("124", 258.50);
        Order order3 = new Order("125", 70.99);

        orders.add(order1);
        orders.add(order2);
        orders.add(order3);

        System.out.println("Collection before sorting : ");
        System.out.println();
        printOrders(orders);

        Collections.sort(orders, new MyComparator());

        System.out.println("Collection after sorting : ");
        printOrders(orders);
    }
}
