package oleksandr.webtesting.rozetka.test;

import oleksandr.webtesting.rozetka.pages.Mainpagerozetka;
import oleksandr.webtesting.rozetka.pages.Rouz;
import org.testng.annotations.Test;
import tests.BaseTest;
import org.openqa.selenium.JavascriptExecutor;
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

@Test
    public  void  Newdevaice(){
        Mainpagerozetka nout = new Mainpagerozetka();
        nout.openrozetka()
                .klaztomenuBaton()
                        .exitNotbook()
                                .exitNotbook1();

}
@Test
    public class Rozeexit extends BaseTest{
        public void openrozetka1(){
            Rouz we32 = new Rouz();
            we32.openrezka()
                    .clikfilms();

        }
}
}


