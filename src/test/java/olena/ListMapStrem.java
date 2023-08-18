package olena;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListMapStrem {
    public static void main(String[] args) {
        List<String> zoo = new ArrayList<>();

        zoo.add("monkey");
        zoo.add("giraffe");
        zoo.add("elephant");
        zoo.add("hippopotamus");
        zoo.add("lion");
        zoo.add("tiger");
        zoo.add("capybara");
        zoo.add("lama");
        zoo.add("lemur");
        zoo.add("zebra");

        Map<Integer, String > zoo1 = new HashMap<>();
        for (int i = 0; i < zoo.size(); i++) {
          zoo1.put(i +1, zoo.get(i) );
        }
       List<String> zoo2 = new ArrayList<>();
        for (int i = 1; i <= zoo1.size(); i++) {
            zoo2.add(zoo1.get(i));
        }
        List<String> sortedZoo2= zoo2.stream()

                .sorted((animal1, animal2) -> Integer.compare(animal1.length(), animal2.length())) // Сортування за довжиною рядків
                .collect(Collectors.toList());
        //.sorted()
        //.collect(Collectors.toList());
        for (String animal:sortedZoo2){
           System.out.println(animal);

        }

    }
}