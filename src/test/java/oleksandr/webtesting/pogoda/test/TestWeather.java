package oleksandr.webtesting.pogoda.test;

import oleksandr.webtesting.pogoda.pages.PagesWeather;
import org.testng.annotations.Test;
import tests.BaseTest;
@Test
public class TestWeather  extends BaseTest {
    public void weather24(){
        PagesWeather wt24 = new PagesWeather();
        wt24.openGoogle()
                .strikaGoogle()
        .enterSerch();

    }

}
