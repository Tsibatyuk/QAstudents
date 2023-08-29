package olena.webtesting.rozetka.test;

import driver.DriverPoll;
import olena.webtesting.rozetka.pages.Mainpage;
import org.testng.annotations.Test;
import tests.BaseTest;


public class Rozetka extends BaseTest {
    @Test
    public void uklanguage() {
        Mainpage uk = new Mainpage();
        uk.openUrl("https://rozetka.com.ua/")
                .assertUrl()
                .cliktomenubutton()
                .printUniqueProductNames();
        sleep(4);
//        System.out.println("Ви обрали українську мову ");

    }
    @Test
    public void newGoogle(){
        DriverPoll.getDriver().get("https://www.google.com");
    }

    @Test
    public void sport() {
        Mainpage sp = new Mainpage();
        sp.openUrl("https://rozetka.com.ua/")
                .assertUrl()
                .cliktomenubutton()
                .cliksport();
        sleep(4);
    }

    @Test
    public void computer() {
        Mainpage co = new Mainpage();
        co.openUrl("https://rozetka.com.ua/")
                .assertUrl()
                .cliktomenubutton()
                .clikcomputer();
        sleep(8);

    }

    @Test
    public void cycle() {
        Mainpage cy = new Mainpage();

        cy.openUrl("https://rozetka.com.ua/")
                .assertUrl()
                .cliktomenubutton()
                .forCycle();
        sleep(5);
    }

    @Test
    public void menu(){
        Mainpage me = new Mainpage();

        me.openUrl("https://rozetka.com.ua/")
                .assertUrl()
                .clikMenu();

    }
    @Test
    public void laptop(){
        Mainpage la = new Mainpage();
        la.openUrl("https://rozetka.com.ua/")
                .assertUrl()
                .cliktomenubutton()
                .clikcomputer()
                .laptop();



    }

}
