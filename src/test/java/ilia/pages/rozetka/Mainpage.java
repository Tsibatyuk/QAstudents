package ilia.pages.rozetka;

import driver.DriverPoll;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import pages.BasePage;
import tests.BaseTest;

import java.util.*;
import java.util.stream.Collectors;

public class Mainpage extends BasePage {
    public Mainpage openRozetka()
    {
        DriverPoll.getDriver().get("https://rozetka.com.ua/ua/");
        return this;
    }

    public Mainpage assertUrl()
    {
        Assert.assertEquals(DriverPoll.getDriver().getCurrentUrl(),"https://rozetka.com.ua/ua/");
        return this;
    }

    @FindBy(xpath = "//a[@class='menu-categories__link']")
        private List<WebElement> searchButton;

    public Mainpage clickToMenuButton()
    {
     click(searchButton.get(0));
     sleep(2);
     scroll(600);
     return this;
    }

    @FindBy(xpath = "//a[@class ='tile-cats__heading tile-cats__heading_type_center ng-star-inserted']")
        private List<WebElement> allMenuLaptopAndComputer;

    public Mainpage laptops()
    {
        click(allMenuLaptopAndComputer.get(0));
        sleep(2);
        scroll(600);
        return this;
    }


    @FindBy(xpath = "//li[@class = 'menu-categories__item ng-star-inserted']")
        private List<WebElement> catalog;

    public Mainpage checkCatalogList()
    {
        System.out.println(catalog.size());
        List<String> nameList = catalog.stream()
                .map(element -> element.getText().toLowerCase())
                .collect(Collectors.toList());
        nameList.forEach(System.out::println);

        Set<Character> letters = catalog.stream()
                .map(element -> element.getText().toLowerCase())
                 .flatMap(word -> word.chars().mapToObj(ch -> (char) ch))
            .collect(Collectors.toSet());
        letters.forEach(System.out::println);
        return this;
    }

    @FindBy(xpath = "//span[@class='goods-tile__price-value']")
    private WebElement laptop;

    public Mainpage price()
    {
        String realisation = laptop.getText().replaceAll("[^0-9]","");

            int ka = Integer.parseInt(realisation);
            String priceWithSymbol = ka + "₴";
            System.out.println(priceWithSymbol);


        return this;
    }
}
