package venya.google.Test;

import driver.DriverPoll;
import maksim.learning.D;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
import tests.BaseTest;
import venya.google.Page.Hotlinepage;

import java.util.List;

public class Hotlinetest extends BaseTest {
    //    @Test
//    public void testHotlinee (){
//        Hotlinetest tee = new Hotlinetest();
//        tee.testHotlinee();
//        tee.parametrizedTestt();
//    }
    @Test(dataProvider = "testData", dataProviderClass = Hotlinepage.class)
    public void parametrizedTestt(String url, String expectedResult) {
        // Ваш тестовий сценарій тут, використовуючи inputData та порівнюючи результат з expectedResult
        DriverPoll.getDriver().get(url);
        System.out.println("URL " + url);
        System.out.println("Expected Result: " + expectedResult);
        sleep(1);
    }

    @Test(dataProvider = "test2", dataProviderClass = Hotlinepage.class)
    public void datatestHot(String categoryname) {
        DriverPoll.getDriver().get("https://hotline.ua/");
        WebElement categoryLink = DriverPoll.getDriver().findElement(new By.ByLinkText(categoryname));
        categoryLink.click();

        String pageTitle = DriverPoll.getDriver().getTitle();
        System.out.println("Категорія - " + categoryname);
        System.out.println("Заголовок сторінки " + pageTitle);

    }

    @Test(dataProvider = "test3", dataProviderClass = Hotlinepage.class)
    public void datahot(String nameCateg) {
        DriverPoll.getDriver().get("https://hotline.ua/");
        WebElement linkcateg = DriverPoll.getDriver().findElement(new By.ByLinkText(nameCateg));
        linkcateg.click();

        String titlepage = DriverPoll.getDriver().getTitle();
        System.out.println("Категорія - " + nameCateg);
        System.out.println("Заголовок сторінки " + titlepage);
    }

    @Test(dataProvider = "test4", dataProviderClass = Hotlinepage.class)
    public void datahotli(String nameCat) {
        DriverPoll.getDriver().get("https://hotline.ua/");
        WebElement linkCat = DriverPoll.getDriver().findElement(new By.ByLinkText(nameCat));
        linkCat.click();

        String titpage = DriverPoll.getDriver().getTitle();
        System.out.println("Категорія - " + nameCat);
        System.out.println("Заголовок сторінки - " + titpage);
    }

    @Test(dataProvider = "test5", dataProviderClass = Hotlinepage.class)
    public void datahott(String name) {
        DriverPoll.getDriver().get("https://hotline.ua/");
        WebElement linkca = DriverPoll.getDriver().findElement(new By.ByLinkText(name));
        linkca.click();

        String titlepagee = DriverPoll.getDriver().getTitle();
        System.out.println("Категорія -- " + name);
        System.out.println("Заголовок сторінки -- " + linkca);

    }

    @Test(dataProvider = "test6", dataProviderClass = Hotlinepage.class)
    public void dataroz(String nameroz) {
        DriverPoll.getDriver().get("https://rozetka.com.ua/ua/computers-notebooks/c80253/");
        WebElement linkroz = DriverPoll.getDriver().findElement(new By.ByLinkText(nameroz));
        linkroz.click();

        String titlerozetka = DriverPoll.getDriver().getTitle();
        System.out.println("Категорія -- " + nameroz);
    }

    @Test(dataProvider = "test7", dataProviderClass = Hotlinepage.class)
    public void rozetka(String roznam) {
        DriverPoll.getDriver().get("https://rozetka.com.ua/ua/sport-i-uvlecheniya/c4627893/");
        WebElement linkrozetka = DriverPoll.getDriver().findElement(new By.ByLinkText(roznam));
        linkrozetka.click();

        String titlerozet = DriverPoll.getDriver().getTitle();
        System.out.println("Категорія -- " + roznam);
    }


    @Test(dataProvider = "test8", dataProviderClass = Hotlinepage.class)
    public void comfy(String comfynam) {
        DriverPoll.getDriver().get("https://comfy.ua/ua/telephone-smartfon/");
        WebElement linkcomfy = DriverPoll.getDriver().findElement(new By.ByLinkText(comfynam));
        linkcomfy.click();

        String titlecomfy = DriverPoll.getDriver().getTitle();
        System.out.println("Категорі -- " + comfynam);

    }

    @Test(dataProvider = "test9", dataProviderClass = Hotlinepage.class)
    public void comfyip(String comfyiphone) {
        DriverPoll.getDriver().get("https://rozetka.com.ua/ua/alkoholnie-napitki-i-produkty/c4626923/");
        WebElement linkcom = DriverPoll.getDriver().findElement(new By.ByLinkText(comfyiphone));
        linkcom.click();
        System.out.println("Категорія -- " + comfyiphone);

    }

    @Test(dataProvider = "test10", dataProviderClass = Hotlinepage.class)
    public void rozepoisk(String poiskroz) {
        DriverPoll.getDriver().get("https://rozetka.com.ua/ua/zootovary/c3520929/");
        WebElement linkroze = DriverPoll.getDriver().findElement(new By.ByLinkText(poiskroz));
        linkroze.click();

        String titleroze = DriverPoll.getDriver().getTitle();
        System.out.println("Назва категорії -- " + poiskroz);
        System.out.println("Заголовок сторінки -- " + titleroze);
    }

}




