package olena;

import org.testng.annotations.Test;

import java.util.ArrayList;

public class klass1 {

    ArrayList<String> qw = new ArrayList<>();
    @Test
    public void qwe() {
        qw.add("Maksimka");
        qw.add("Sachka");
        qw.add("Illyshka");
        qw.add("Olenka Pisyha");
        qw.add("EvgeniyMykolayovych");
        qw.add("Vladyshka");
        qw.add("washedpisyun");

        String thirdElement = String.valueOf(qw.stream().skip(0).findFirst(). orElse(null));
        String lastElement;
        lastElement = String.valueOf(qw.stream().reduce((first, second) -> second). orElse(null));


        System.out.println("Перший елемент:" + thirdElement);
        System.out.println("Останній елемент:" + lastElement);



    }
}
