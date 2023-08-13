package maksim;

import abstractpages.BaseTest;
import org.asynchttpclient.netty.ws.NettyWebSocket;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Myclass extends BaseTest {

    @Test
    public void someMethod() {
        openUrl("https://www.google.com/");
    }

    @Test
    public void ph() {
        for (int i = 5; i <= 50; i++) {

            System.out.println(i);
        }
    }@Test
    public void nn() {
        List<Integer> str = new ArrayList<>();
        for (int i = 0; i <=10; i++) {
            str.add(i);}
        List<Integer> evenNumbers = str.stream()
                .filter(num -> num % 2 == 0)
                .sorted()
                .collect(Collectors.toList());

        evenNumbers.forEach(System.out::println);
    }@Test
    public void sec(){
        Test1 test1 = new Test1();
        System.out.println(test1.result);
        System.out.println(test1.summ(5,5));


    }
    }

