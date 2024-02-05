package Task5;

import java.text.Collator;
import java.util.*;

public class Students {

    public static void main (String [] args) {

        Set<String> names = new TreeSet<>(Arrays.asList
                ("Roland", "Olga", "Stanislav", "Sviatoslav", "Pavel", "Irina", "Artem", "Olesja", "Olga", "Ilja"));

        System.out.println(names);
    }
}
