package olena.webtesting.google.test;

import olena.webtesting.google.pages1.Mainpage1;
import org.testng.annotations.Test;
import tests.BaseTest;

public class Google extends BaseTest {

    @Test
    public void searche(){
        Mainpage1 se = new Mainpage1();
        se.openGoogle()
                .writeInGoogle()
                .enterSearch()
                .displayWeatherOnGoogle();

    }
}
