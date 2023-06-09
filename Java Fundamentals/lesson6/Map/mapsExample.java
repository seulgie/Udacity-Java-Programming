import java.util.*;


public class MapExercise {

    public static void main(String[] args) {

        Map<String, Person> mapOfPeople = new HashMap<String, Person>();
        Person mike = new Person("Mike", "mike@email.com");
        Person shaun = new Person("Shaun", "shaun@email.com");
        Person sally = new Person("Sally", "sally@email.com");
        Person cesar = new Person("Cesar", "cesar@email.com");

        mapOfPeople.put(mike.getEmail(), mike);
        mapOfPeople.put(shaun.getEmail(), shaun);
        mapOfPeople.put(sally.getEmail(), sally);
        mapOfPeople.put(cesar.getEmail(), cesar);

        // mike@email.com
        for (String email : mapOfPeople.keySet()) {
            System.out.println(email);
        }

        // Mike mike@email.com
        for (Person person : mapOfPeople.values()) {
            System.out.println(person);
        }

        System.out.println("Get Mike: " + mapOfPeople.get("mike@email.com")); // Get Mike: Mike mike@email.com
        System.out.println("Get Jeff: " + mapOfPeople.get("jeff@email.com")); // Get Jeff: null
        System.out.println("Contains Mike: " + mapOfPeople.containsKey("mike@email.com")); // Contains Mike: true
        System.out.println("Contains Jeff: " + mapOfPeople.containsKey("jeff@email.com")); // Contains Jeff: false

    }
}
