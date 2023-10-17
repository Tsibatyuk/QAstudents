package ilia.tenTest.lambda;

import pages.BasePage;

import java.util.ArrayList;
import java.util.List;

public class Lambda10 extends BasePage {
    public Lambda10 test20() {
        List<Integer> eighthMethod = new ArrayList<>();
        eighthMethod.add(35532);
        eighthMethod.add(1342);
        eighthMethod.add(3532);
        eighthMethod.add(534);
        final Integer[] min = {eighthMethod.get(0)};
        eighthMethod.forEach(item -> {
            if (item.compareTo(min[0]) < 0) {
                min[0] = item;
            }
        });
        System.out.println("Lambda10: " + min[0]);
        return this;
    }
}
