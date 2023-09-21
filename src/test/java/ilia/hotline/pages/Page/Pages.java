package ilia.hotline.pages.Page;

import driver.DriverPoll;
import ilia.hotline.pages.mainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.BasePage;
import tests.BaseTest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Pages extends BasePage {
    public Pages openHotline() {
        DriverPoll.getDriver().get("https://hotline.ua/");
        return this;
    }

    public Pages assertUrl() {
        Assert.assertEquals(DriverPoll.getDriver().getCurrentUrl(), "https://hotline.ua/?gclid=CjwKCAjwjOunBhB4EiwA94JWsIbkHmB1JQd7iPFxXGZO4blgMF3NdIGuE_jGGEe1ny7JmCRJy7YO8xoCz8oQAvD_BwE");
        return this;
    }

    @FindBy(xpath = "//div[@class = 'categories-section__inner']/*")
    private List<WebElement> allMenu;

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
    public void checkTitle(String t){
        String xpathText = String.format("//a[@data-eventlabel='%s']", t);
        String name = DriverPoll.getDriver().findElement(By.xpath(xpathText)).getText().toLowerCase().replaceAll("\\s+", "");
        DriverPoll.getDriver().findElement(By.xpath(xpathText)).click();
        sleep(2);
        String actualName = DriverPoll.getDriver().findElement(By.xpath("//h1[@class='title-page flex middle-xs section-title']/i")).getText().toLowerCase().replaceAll("\\s+", "");
        Assert.assertEquals(actualName, name);

    }
}
