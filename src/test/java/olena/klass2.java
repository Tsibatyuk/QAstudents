package olena;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class klass2 {
 @Test
    public void qw() {
        List<Integer> str = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
           str.add(i);}
        List<Integer> evenNumbers = str.stream()
                .filter(num -> num % 2 == 0)
                .sorted()
                .collect(Collectors.toList());

        evenNumbers.forEach(System.out::println);
        }
    }

