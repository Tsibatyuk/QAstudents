package olena.google.test;

import driver.DriverPoll;
import olena.google.pages1.Mainpage1;
import olena.webtesting.rozetka.pages.Mainpage;
import org.testng.annotations.Test;
import pages.BasePage;
import tests.BaseTest;

public class Google extends BaseTest {

    @Test
    public void searche(){
        Mainpage1 se = new Mainpage1();
        se.openGoogle()
                .writeInGoogle()
                .enterSearch();

    }
}
