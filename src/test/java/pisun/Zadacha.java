package pisun;

import abstractpages.BaseTest;
import org.testng.annotations.Test;

import java.util.LinkedList;
import java.util.List;

@Test
public class Zadacha {
    public void someMethod() {
//        openUrl("https://makeup.com.ua/ua/");
        List<Integer> apple = new LinkedList<>();
        for (int i = 1; i <= 10; i++) {
            apple.add(i);
            System.out.println(i);
            System.out.println(apple);

        }
        apple.stream()
                .filter(number -> number % 5 == 0)
                .forEach(System.out::println);


//
//Apple.add(3);
//Apple.add(4);
//Apple.add(5);
//    System.out.println("порахуй"+);

    }
}


