package iteracje;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Names {
    public static void main(String[] args) {
        Set <String> names = new TreeSet<>();
        names.add("Ola");
        names.add("Kasia");
        names.add("Krzysiek");
        names.add("Roman");
        names.add("Aneta");

        showAllNames(names);

//        Iterator <String> iterator = names.iterator();
//        while(iterator.hasNext()) {
//            String next = iterator.next();
//            System.out.println(next);
//        }
    }

    private static void showAllNames(Set<String> names) {
        for (String num : names) {
            System.out.println(num);
        }
    }
}
