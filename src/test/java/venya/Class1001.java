package venya;

import java.util.ArrayList;
import java.util.List;

public class Class1001 {

    public static void main(String[] args) {
        List<String> constructor = new ArrayList<>();
        Class100 pineapple = new Class100("Pineapple" , "yellow" , "3500");
        Class100 melon = new Class100("watermelon", "green" ,"5700");
        Class100 mango = new Class100("mango" ,"orange" ,"1300");
        Class100 banana = new Class100("banana" , "yellow" ,"0.300");

        System.out.println(pineapple.getName()+ " " + pineapple.getColor()+ " " + pineapple.getWeight());

        System.out.println(banana.getName()+ " " + banana.getColor()+ " " + banana.getWeight());
        System.out.println(mango.getName()+ " " + mango.getColor()+ " " + banana.getWeight());
        System.out.println(melon.getName()+ " " + melon.getColor()+ " " + melon.getWeight());


    }
}
