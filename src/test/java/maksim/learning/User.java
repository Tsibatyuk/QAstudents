package maksim.learning;

import org.testng.annotations.Test;

public class User {
    int age = 30;
    String name = "Maksim";
    String loshara = "Sasha";
    String telka = "Alena";
    String god ="Zhenya";
    String drocher = "Venya";
    @Test
    public void lohi(){


      //  String cool = String.format("%s пісяє на%s.%d Разів,",telka,loshara,age);
        System.out.printf("%s pi on %s a %s pi on %s ha ha ha  ",loshara,telka,telka,loshara);
        System.out.printf(" а %s нюхає Бебру у %s і %s молодець",drocher,god,name);
        //String hot = String.valueOf( age);
        //System.out.println(age);

    }
}
