package oleksandr.smeshkin;

import org.testng.annotations.Test;

import java.util.*;
import java.util.stream.Collectors;

public class ListTest {
@Test
 public void mapalmokm (){
     List<Integer> Lorakat= new LinkedList<>();
     Lorakat.add(10);
     Lorakat.add(20);
     Lorakat.add(30);
     Lorakat.add(40);
     Lorakat.add(50);
    System.out.println("Максикголубасик " + Lorakat);

    List<Integer> sortedList = Lorakat.stream()
            .sorted()
            .collect(Collectors.toList());
    for (Integer str : sortedList) {
        System.out.println(str);

    } Lorakat.add(60);
System.out.println(Lorakat);
    Lorakat.add(60);
    System.out.println(Lorakat);
Lorakat.add(70);
    System.out.println(Lorakat);
Lorakat.add(80);
    System.out.println(Lorakat);
Lorakat.add(90);
    System.out.println(Lorakat);
Lorakat.add(100);
    System.out.println(Lorakat);
    System.out.println(Lorakat.size());
Lorakat.remove(9);
    System.out.println(Lorakat);
Lorakat.remove(8);
    System.out.println(Lorakat);
Lorakat.remove(3);
    System.out.println(Lorakat);

}
}


