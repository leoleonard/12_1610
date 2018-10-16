package kolejki;

import java.util.LinkedList;
import java.util.Queue;

public class Hospital {
    public static void main(String[] args) {
        Queue<Person> poczekalnia = new LinkedList<>();

        poczekalnia.offer(new Person("Adam", "Kowalski", "235"));
        poczekalnia.offer(new Person("Jan", "Kowalski", "9000"));
        poczekalnia.offer(new Person("Katrzyna", "Sromotna", "58000"));
        poczekalnia.offer(new Person("Olga", "Wąska", "98000"));

        Person person = poczekalnia.poll();

        for (Person pacjent : poczekalnia) {
            System.out.println(pacjent);
        }
//            System.out.println(person);
//             person = poczekalnia.poll();
    }

}
