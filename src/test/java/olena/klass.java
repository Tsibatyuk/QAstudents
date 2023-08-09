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

@Test
    public void aa() {
        List<String> fj = new ArrayList<>();

        fj.add("3");
        fj.add("Olenka");
        fj.add("69");
        fj.add("Vladik");
        fj.add("Zenya");
        fj.add("Sanya");

        for (int i = 2; i <= 2; i++) {
            System.out.println(fj.get(i));



        }

    }
}


