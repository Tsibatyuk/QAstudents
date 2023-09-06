package oleksandr.webtesting.rozetka.test;

import oleksandr.webtesting.rozetka.pages.Mainpagerozetka;
import org.testng.annotations.Test;
import tests.BaseTest;
import java.util.Set;

public class Rozetka extends BaseTest {

    @Test
public void Ukrtest(){
    Mainpagerozetka ok =new Mainpagerozetka();
    ok.openrozetka()
            .assertUrl()
            .klaztomenuBaton()
            .lora();
    sleep(6);
        System.out.println("Бендерівська мова сила");
    }
@Test
    public void Sad(){
    Mainpagerozetka gorod = new Mainpagerozetka();
    gorod.openrozetka()
//            .checkTheLanguge()
            .klaztomenuBaton()
            .clickspot();
sleep(2);

    }
    @Test
    public  void Testlogin(){
     Mainpagerozetka mr = new Mainpagerozetka();
     mr.openrozetka()
             .selectlatters();

     sleep(4);

    }


}


