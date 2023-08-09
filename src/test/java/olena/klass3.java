package olena;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class klass3 {
@Test
    public void qwe() {
        List<String> qw = new ArrayList<>();

        qw.add("яблуко");
        qw.add("груша");
        qw.add("слива");
        qw.add("манго");
        qw.add("абрикос");
        qw.add("алича");

        qw.stream()
                .findFirst()
                .ifPresent(System.out::println);
    }



    }
