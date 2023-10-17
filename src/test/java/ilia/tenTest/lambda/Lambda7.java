package ilia.tenTest.lambda;

import pages.BasePage;

import java.util.ArrayList;
import java.util.List;

public class Lambda7 extends BasePage {
    public Lambda8 test17()
    {
        List<Integer> seventhMethod = new ArrayList<>();
        seventhMethod.add(14);
        seventhMethod.add(34);
        seventhMethod.add(17);
        seventhMethod.add(16);
        seventhMethod.add(874);
        seventhMethod.forEach(num -> {
            if(num % 2 == 0)
            {
                System.out.println("Lambda7: " + num);
            }
            else
            {
                System.out.println("Lambda7: Odd element");
            }
        });
        return new Lambda8();
    }
}
