package maksim;

import org.testng.annotations.Test;

import java.util.*;

public class Mapa {
int i;
    @Test
    public void m1apa(){
    Map<Integer, String> hash = new HashMap<>();

        hash.put(1, "orange");
    hash.put(3,"apple");
    hash.put(7,"lemon");
    hash.put(11,"peach");
    hash.put(null,"choco");
        System.out.println(hash.get(null));
        List<String> ls = new LinkedList<>();
        for ( i = 0; i <= 10; i++) {
            ls.add(String.valueOf(i));
        }
        System.out.println(ls);

        List<Double> yi = new ArrayList<>();
        yi.add(878762.16);

 
    }
}


