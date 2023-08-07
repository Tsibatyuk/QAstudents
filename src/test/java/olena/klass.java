package olena;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class klass {
    @Test
    public void class18() {
        List<String> myList = new ArrayList<>();

        myList.add("One");
        myList.add("Two");
        myList.add("Three");
         String allElement = String.valueOf(myList.stream().findFirst());

        System.out.println(myList.get(2));

    }
}




