package Task4;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String [] args) {

        Client client1 = new Client(LocalDate.now(), "Ivan", 30);
        Client client2 = new Client(LocalDate.now(), "Nikita", 27);
        Client client3 = new Client(LocalDate.now(), "Artem", 36);

        client1.orders.add(new Order(91.99, "Scooter"));
        client2.orders.add(new Order(55.85, "Clothing"));
        client3.orders.add(new Order(750.50, "Smartphone"));

        Map<String, Client> map = new HashMap<>();
        map.put("152999150", client1);
        map.put("153100151", client2);
        map.put("154200152", client3);

        for (Map.Entry<String, Client> entry : map.entrySet()) {
            System.out.println("Номер паспорта : " + entry.getKey() + ", " + "Клиент : " + entry.getValue().name);
        }

        System.out.println();

        Iterator<Map.Entry<String, Client>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Client> entry = iterator.next();
            System.out.println("Номер паспорта : " + entry.getKey() + ", " + "Клиент : " + entry.getValue().name);
        }

        System.out.println();

        System.out.println("Номер паспорта : " + map.keySet());

        System.out.print("Клиент : ");
        for (Client client : map.values())
            System.out.print(client.getName() + ", ");
    }
}
