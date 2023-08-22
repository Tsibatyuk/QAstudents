package tests.rozetka;

import org.testng.annotations.Test;
import pages.rozetka.MainPage;

import tests.BaseTest;

public class BuyingTest extends BaseTest {

    @Test
    public void checkSections(){

        MainPage mainPage = new MainPage();

        mainPage.openPage()
                .clickMenuBtn()
                .getListOfElements();

    }

    public void method2(){

        Constructorsss Macs;
        Macs = new Constructorsss("Maksim", "Familia", 12, 1235);

    }



}
