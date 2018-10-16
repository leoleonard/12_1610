package mapy;

import java.util.*;
import java.util.Map.Entry;

public class Account {
    public static void main(String[] args) {

        Map<Long, Customer> customers = new HashMap<>();


        Customer customer1 = new Customer(111L, "Jan", "Kowalski", 555225093);
        Customer customer2 = new Customer(222L, "Ola", "Mataoła", 23244443);
        Customer customer3 = new Customer(333L, "Mikolaj", "Gruby", 34233232);


        customers.put(customer1.getId(), customer1);
        customers.put(customer2.getId(), customer2);
        customers.put(customer3.getId(), customer3);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj id klienta");
        long l = scanner.nextLong();


        customers.put(customer1.getId(), customer1);
        customers.put(customer2.getId(), customer2);
        customers.put(customer3.getId(), customer3);

        Customer customer = customers.get(l);
        if (customer != null) {
            System.out.println(customer);
        } else {
            System.out.println("Klient nie istnieje w bazie");
        }

        Set<Long> keys = customers.keySet();
        //System.out.println(keys);

        Collection<Customer> values = customers.values();
        //  for (Customer value : values) {
//            System.out.println(value);
        //       if (l == value.getId()) {
      //  System.out.println(value);
        //      }
//            else if (l != value.getId()) {
//                    System.out.println("Klient nie istnieje w bazie");
//                }
//            }
//        }

//        Set<Map.Entry<Long, Customer>> entries = customers.entrySet();
//
//        for (Map.Entry<Long, Customer> entry : entries) {
//            Long key = entry.getKey();
//            Customer value = entry.getValue();
//            System.out.println("Klucz: " + key + " | Wartość: " + value);
//        }


//    }
    }
}