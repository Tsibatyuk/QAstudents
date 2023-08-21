package oleksandr.webtesting.rozetka.test;

import abstractpages.BaseTest;
import oleksandr.webtesting.rozetka.pages.Mainpj;
import org.testng.annotations.Test;

public class Rozetka extends BaseTest {
    @Test
public void Ukrtest(){
    Mainpj ok =new Mainpj();
    ok.openrozetka()

            .assertUrl();
        System.out.println("Бендерівська мова сила");
    }
}


