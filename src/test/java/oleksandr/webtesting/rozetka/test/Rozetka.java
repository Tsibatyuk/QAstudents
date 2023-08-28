package oleksandr.webtesting.rozetka.test;

import driver.Browser;
import oleksandr.webtesting.rozetka.pages.Mainpj;
import org.testng.annotations.Test;
import tests.BaseTest;

public class Rozetka extends BaseTest {

    @Test
public void Ukrtest(){
    Mainpj ok =new Mainpj();
    ok.openrozetka()
            .assertUrl()
            .klaztomenuBaton()
            .lora();
    sleep(6);
        System.out.println("Бендерівська мова сила");
    }
@Test
    public void Sad(){
    Mainpj gorod = new Mainpj();
    gorod.openrozetka()
//            .checkTheLanguge()
            .klaztomenuBaton()
            .clickspot();
sleep(2);

    }

}


