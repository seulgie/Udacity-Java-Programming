import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class SortingExample {

    public static void main(String[] args){
        List<String> names = new LinkedList<String>();

        names.add("Mike");
        names.add("Bob");
        names.add("Alice");

        // before sorting
        for (String name : names) {
            System.out.println(name);
        }

        // sorting
        Collections.sort(names);

        // after sorting
        for (String name : names) {
            System.out.println(name);
        }
    }
}
