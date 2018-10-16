package mapy;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Account {
    public static void main(String[] args) {
        HashMap<Integer, Customer> customers = new HashMap<>();

        Customer customer1 = new Customer("Jan", "Kowalski", 555225093);
        Customer customer2 = new Customer("Ola", "Mataoła", 23244443);
        Customer customer3 = new Customer("Jan", "Sztras", 34233232);

        customers.put(111, customer1);
        customers.put(222, customer2);
        customers.put(333, customer3);

        Set<Integer> keySet = customers.keySet();
        Set<Entry<Integer, Customer>> entrySet = customers.entrySet();

        System.out.println(keySet);

        Collection<Customer> values = customers.values();

        for (Customer value : values) {
            System.out.println("Customer " + value);
        }
    }

}
