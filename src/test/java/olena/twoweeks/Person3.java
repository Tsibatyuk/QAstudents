package olena.twoweeks;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Person3 {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        Person1 pineapple = new Person1("Pineapple", "yellow", 3.500);
        Person1 watermelon = new Person1("Watermelo", "green", 5.700);
        Person1 mango = new Person1("Mango", "orange", 1.300);
        Person1 banana = new Person1("Banana", "yellow", 0.300);

        fruits.add(pineapple.getName());
        fruits.add(watermelon.getName());
        fruits.add(mango.getName());
        fruits.add(banana.getName());

        Map<Integer, String> fruits1 = new HashMap<>();
        for (int i = 0; i < fruits.size(); i++) {
            fruits1.put( i+1, fruits.get(i));

        }
        System.out.println(fruits1);
    }
}