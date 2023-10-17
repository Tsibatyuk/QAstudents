package ilia.tenTest.lambda;

import pages.BasePage;

import java.util.ArrayList;
import java.util.List;

public class Lambda6 extends BasePage {
    public Lambda7 test16()
    {
        final int[] sum = {0};
        List<Integer> sixthMethod = new ArrayList<>();
        sixthMethod.add(23);
        sixthMethod.add(34);
        sixthMethod.add(45);
        sixthMethod.forEach(num -> sum[0] += num);
        System.out.println("Lambda6: " + sum[0]);
        return new Lambda7();
    }
}
