package ilia.tenTest.lambda;

import pages.BasePage;

import java.util.ArrayList;
import java.util.List;

public class Lambda8 extends BasePage {
    public Lambda9 test18()
    {
        List<Integer> eighthMethod = new ArrayList<>();
        eighthMethod.add(35532);
        eighthMethod.add(1342);
        eighthMethod.add(3532);
        eighthMethod.add(534);
        final Integer[] max = {eighthMethod.get(0)};
        eighthMethod.forEach (item -> {
            if(item.compareTo(max[0]) > 0)
            {
                max[0] = item;
            }
        });
        System.out.println("Lambda8: " + max[0]);
        return new Lambda9();
    }
}
