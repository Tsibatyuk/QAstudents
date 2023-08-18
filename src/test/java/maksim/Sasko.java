package maksim;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sasko {
@Test
public void Primitives(){
    List<String> drink = new ArrayList<>();

   drink.add("cola");
   drink.add("fanta");
   drink.add("spiite");
   drink.add("shweps");
   drink.add("cola zerro");
   drink.add("orange");
   drink.add("cola lime ");

    Map<Integer,String> mapdrink = new HashMap<>();
    for (int i = 0; i < drink.size(); i++) {
        mapdrink.put(i + 1, (String) drink.get(i));
    }
    List <String> drink1 = new ArrayList<>();
    for (int i = 0; i <= mapdrink.size(); i++) {
        drink1.add(mapdrink.get(i));

    }

    List<String> u = drink.stream()
                    .sorted()
            .collect(Collectors.toList());
    System.out.println(u);




    }


  }

