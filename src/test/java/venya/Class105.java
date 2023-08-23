package venya;

import java.util.ArrayList;
import java.util.List;

public class Class105 {

    public static void main(String[] args) {
        List<String> construc = new ArrayList<>();
        Class104 Venya = new Class104("Venya" , " male" , "21");
        Class104 Ilia = new Class104("Ilia" , " male" , "20");
        Class104 Andrey = new Class104("Andrey" , "male" , "19");
        Class104 Pasha = new Class104("Pasha" , "male" , "18");


        System.out.println(Venya.getName()+ " " + Venya.getSex()+ " " + Venya.getAge());
        System.out.println(Ilia.getName()+ " " + Ilia.getSex()+ " " + Ilia.getAge());
        System.out.println(Andrey.getName()+ " " + Andrey.getSex()+ " " + Andrey.getAge());
        System.out.println(Pasha.getName()+ " " + Pasha.getSex()+ " " + Pasha.getAge());
    }
}
