package olena.webtesting.rozetka.test;

import driver.DriverPoll;
import olena.webtesting.rozetka.pages.Mainpage;
import org.testng.annotations.Test;
import tests.BaseTest;


public class Rozetka extends BaseTest {
    @Test
    public void uklanguage() {
        Mainpage uk = new Mainpage();
        uk.openrozetka()
                .assertUrl()
                .cliktomenubutton()
                .printUniqueProductNames();
        sleep(4);
//        System.out.println("Ви обрали українську мову ");

    }
@Test
    public void sport() {
            Mainpage sp = new Mainpage();
            sp.openrozetka()
                    .assertUrl()
                    .cliktomenubutton()
                            .cliksport();
    sleep(4);
    }

 @Test
    public void computer(){
        Mainpage co = new Mainpage();
        co.openrozetka()
                .assertUrl()
                .cliktomenubutton()
                .clikcomputer();
        sleep(8);

    }
@Test
    public void cycle(){
        Mainpage cy = new Mainpage();
        cy.openrozetka();
    cy.assertUrl();
    cy.cliktomenubutton();
    sleep(2);
    cy.forCycle();
        sleep(5);
}
}
