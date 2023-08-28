package venya;

import java.util.ArrayList;
import java.util.List;

public class Class107 {

    public static void main(String[] args) {
        List<String> math = new ArrayList<>();

        Class106 ben = new Class106("ben" , "34" , "tennis coach");
        Class106 john = new Class106("john" , "87" , "retired");
        Class106 mike = new Class106("mike" , "39" , "doctor");
        Class106 pete = new Class106("pete" ," 12", "student");

        System.out.println(ben.getName()+ " " + ben.getAge()+ " " + ben.getJob());
        System.out.println(john.getName()+ " " + john.getAge()+ " " + john.getJob());
        System.out.println(mike.getName()+ " " + mike.getAge()+ " " + mike.getJob());
        System.out.println(pete.getName()+ " " + pete.getAge()+ " " + pete.getJob());

    }
}
