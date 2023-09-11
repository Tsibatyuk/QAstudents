package maksim.webtesting.pohoda.test;

import maksim.webtesting.pohoda.page.MainPage;
import org.testng.annotations.Test;
import tests.BaseTest;

public class TestPohoda extends BaseTest {
    @Test
    public void testpohodaTemp(){
        MainPage testTemp = new MainPage();
        testTemp.openSinoptik()
                .checkTemperature();

    }
}
