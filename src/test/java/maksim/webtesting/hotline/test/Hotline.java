package maksim.webtesting.hotline.test;

import driver.DriverPoll;
import maksim.webtesting.hotline.pages.DataPro;
import maksim.webtesting.hotline.pages.MainpageHot;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import tests.BaseTest;

public class Hotline extends BaseTest {
    @Test
    public void openHotline(){
        MainpageHot ohl = new MainpageHot();
        ohl.openHotline()
                .SingUp()
                .pystePole()
                .singIn();
        sleep(5);
    }
    @Test(dataProvider = "data",dataProviderClass = DataPro.class)
    public void psrameterTest(String url,String expectedResult){
        DriverPoll.getDriver().get(url);
        System.out.println("url"+ url);
        System.out.println("Expected Result:" + expectedResult);
    }

    @Test(dataProvider = "testData",dataProviderClass = DataPro.class)
    public void hotLineCategories(String categoryName){
        DriverPoll.getDriver().get("https://hotline.ua/");
        WebElement categoryLink = driver.DriverPoll.getDriver().findElement(By.linkText(categoryName));
        categoryLink.click();

        String pageTitle = driver.DriverPoll.getDriver().getTitle();
        System.out.println("Категорія" + categoryName);
        System.out.println("Заголовок" + pageTitle);
    }

}
