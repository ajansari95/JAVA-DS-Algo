package lists;
import java.util.*;

public class MyArrayList {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("3");
        System.out.println(fruits);
        Pair<String, Integer> p1 = new Pair<>("Ajaz",23);
        Pair<Boolean, String> p2 = new Pair<>(true,"bye");
        p1.getDescription();
        p2.getDescription();
    }
}
