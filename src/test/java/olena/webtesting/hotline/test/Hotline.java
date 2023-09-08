package olena.webtesting.hotline.test;

import driver.DriverPoll;
import olena.webtesting.hotline.pages2.DataPro;
import olena.webtesting.hotline.pages2.Mainpage2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import tests.BaseTest;

public class Hotline extends BaseTest {
    @Test
    public void testHotline() {
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
        System.out.println("URL " + url);
        System.out.println("Expected Result: " + expectedResult);
    }

    @Test(dataProvider = "test", dataProviderClass = DataPro.class)
    public void dataTestHotline(String categoryname) {
        DriverPoll.getDriver().get("https://hotline.ua/");
        WebElement categoryLink = DriverPoll.getDriver().findElement(new By.ByLinkText(categoryname));
        categoryLink.click();

        String pageTitle = DriverPoll.getDriver().getTitle();
        System.out.println("Категорія " + categoryname);
        sleep(2);
        System.out.println("Заголовок сторінки " + pageTitle);


    }
}