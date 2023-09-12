package olena.webtesting.hotline.test;

import driver.DriverPoll;
import olena.webtesting.hotline.pages2.DataPro;
import olena.webtesting.hotline.pages2.Mainpage2;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import tests.BaseTest;

public class Hotline extends BaseTest {
@Test
    public void testHotline (){
        Mainpage2 te = new Mainpage2();
        te.openHotline()
                .goodLoginHotline()
                //.emptyField()
                .goodHotline();

    }
    @Test(dataProvider = "testData", dataProviderClass = DataPro.class)
    public void parametrizedTest(String url, String expectedResult) {
        // Ваш тестовий сценарій тут, використовуючи inputData та порівнюючи результат з expectedResult
        DriverPoll.getDriver().get(url);
        System.out.println("URL " + url );
        System.out.println("Expected Result: " + expectedResult);
    }
}