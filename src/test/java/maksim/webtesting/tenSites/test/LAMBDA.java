package maksim.webtesting.tenSites.test;

import maksim.webtesting.tenSites.page.LambdaInterface;
import maksim.webtesting.tenSites.page.LamdaPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasePage;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Test
public class LAMBDA {

    public void vvm() {
        int sum = Stream.of(1, 2, 3).reduce(0, (acc, element) -> acc + element);
        Assert.assertEquals(6, sum);
    }

    public void mvv() {
        int sum = Stream.of(50, 50, 10).reduce(0, (x, y) -> x + y);
        Assert.assertEquals(110, sum);
    }

    public void move() {
        List<Integer> artist = new ArrayList<>();
        artist.add(234);
        artist.add(345);
        artist.add(33);
        artist.add(221);
        artist.add(332);

        List<Integer> music = new ArrayList<>();
        music.add(23);
        music.add(29);
        music.add(26);
        music.add(25);
        music.add(24);

        List<Integer> together = Stream.of(artist, music)
                .flatMap(num -> num.stream())
                .collect(Collectors.toList());
        System.out.println(together);
        Assert.assertEquals(artist, together);
    }

    public void min() {
        List<Integer> minimum = new ArrayList<>();
        minimum.add(123);
        minimum.add(45668);
        minimum.add(7896);
        Optional<Integer> a = minimum.stream()
                .max(Comparator.comparing(Integer::byteValue));
        Optional<Integer> b = minimum.stream().min(Comparator.comparing(Integer::byteValue));
        Assert.assertEquals(a, b);
    }


    }





