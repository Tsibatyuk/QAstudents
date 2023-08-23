package venya;

import java.util.ArrayList;
import java.util.List;

public class Class103 {

    public static void main(String[] args) {
        List<String> geography = new ArrayList<>();

        Class102 ukraine = new Class102("ukraine" , "kyiv" , "europe");
        Class102 france = new Class102("france" , "paris" , "europe");
        Class102 germany = new Class102("germany" , "berlin" , "europe");
        Class102 austria = new Class102("austria" , "viena" , "europe");

        System.out.println(ukraine.getCountry()+ " " + ukraine.getCapital()+ " " + ukraine.getContinent());
        System.out.println(france.getCountry()+ " " + france.getCapital()+ " " + france.getCountry());
        System.out.println(germany.getCountry()+ " " + germany.getCapital()+ " " + germany.getContinent());
        System.out.println(austria.getCountry()+ " " + austria.getCapital()+ " " + austria.getContinent());


    }
}
