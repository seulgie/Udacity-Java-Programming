import java.util.ArrayList;

public class CollectionsExercise {

    public static void main(String[] args){
        //Collections List of Strings
        ArrayList<String> listOfItems = new LinkedList<String>();

        listOfItems.add("Mike");
        listOfItems.add("Bob");
        listOfItems.add("Alice");

        //for each loop
        for (String name : listOfItems){
            System.out.println(name);
        }
    }
}
