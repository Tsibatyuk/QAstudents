package ilia.hotline.pages.test;

import driver.DriverPoll;
import ilia.hotline.pages.Page.Pages;
import ilia.hotline.pages.mainPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.BasePage;
import tests.BaseTest;

public class testHotline extends BaseTest {

    @DataProvider(name = "arrays")
    public Object[][] testData() {
        return new Object[][]{
                {"Hi"},
                        {"BB"}
        };
    }


    @Test (dataProvider = "menu")
    public void hotlineTests(String str)
    {
        mainPage mp = new mainPage();
        mp.openHotline();
        System.out.println(str);
        sleep(4);
    }




    @DataProvider(name = "menu")
    public Object[][] testDataMenu() {
        return new Object[][]{
                {"Енергозабезпечення"},
                {"Авто і Мото"},
                {"Побутова техніка"},
                {"Все для дому"},
                {"Дача, сад"},
                {"Дитячі товари"},
                {"Зоотовари"},
                {"Інструменти"},
                {"Комп'ютери, Мережі"},
                {"Краса і здоров'я"},
                {"Музичні інструменти"},
                {"Сантехніка, Будматеріали"},
                {"Смартфони, Телефони"},
                {"Спорт, Активний відпочинок"},
                {"ТБ, Аудіо, Відео, Фото"},
                {"Товари для дорослих"},
                {"Товари для геймерів"},
                {"Туризм, Риболовля"},
                {"Годинники, Сумки, Аксесуари"}
        };
    }


    @Test(dataProvider = "menu")
    public void hotlineTest(String t)
    {
       Pages p = new Pages();
       p.openHotline();
        String xpathText = String.format("//a[@data-eventlabel='%s']", t);
        sleep(2);
        String name = DriverPoll.getDriver().findElement(By.xpath(xpathText)).getText().toLowerCase().replaceAll("\\s+", "");
        System.out.println(name);
        DriverPoll.getDriver().findElement(By.xpath(xpathText)).click();
        sleep(2);
        String actualName = DriverPoll.getDriver().findElement(By.xpath("//h1[@class='title-page flex middle-xs section-title']")).getText().toLowerCase().replaceAll("\\s+", "");
        System.out.println(actualName);

        Assert.assertEquals(actualName, name);


    }
}
