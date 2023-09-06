package venya.webtesting.rozetka.pages.rozetka;

import driver.DriverPoll;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.reporters.jq.Main;
import pages.BasePage;

import java.util.*;
import java.util.stream.Collectors;

public class Mainpage extends BasePage {
    public Mainpage openrozetka() {
        DriverPoll.getDriver().get("https://rozetka.com.ua");
        return this;
    }


    public Mainpage assertUrl() {

        Assert.assertEquals(DriverPoll.getDriver().getCurrentUrl(), "https://rozetka.com.ua/ua/");


        return this;
    }

    @FindBy(xpath = "//*[@id='fat-menu']")
    private WebElement fatmenu;

    public Mainpage ClickToMenubutton() {
        click(fatmenu);
        return this;
    }

    @FindBy(xpath = "//div[contains(@class,'animated')]//*[.='Ноутбуки та комп’ютери']")
    private WebElement laptops;

public Mainpage laptopcomp(){
    click(laptops);
    sleep(2);
    scroll(500);
    return this;
}


@FindBy(xpath = "//img[contains(@alt,'Ноутбуки')]")
    private WebElement comp;

public Mainpage computer(){
    click(comp);
    sleep(2);
    return this;
}

@FindBy(xpath = "//input[1]")
private List<WebElement> search;

public Mainpage sort(){
    sleep(2);
    search.get(1).click();
    sleep(2);
    search.get(1).sendKeys("Asus");
    sleep(5);
//    click(search.get(0));
//    setValue(search.get(0), "Asus");
//    sleep(2);
//    setValue(search.get(0), Keys.ESCAPE.toString());
//    sleep(2);
    return this;
}



@FindBy(xpath = "//div[@data-goods-id='391643262'][@class='goods-tile__inner']")
    private WebElement lap;

public Mainpage thislap(){
    click(lap);
    sleep(2);
    return this;
}

@FindBy(xpath = "//p[@class='product-price__big product-price__big-color-red']")
    private WebElement price;

public Mainpage thisprice(){
    click(price);
    sleep(2);
    String Textprice = price.getText();


String cleanedTextprice = Textprice.replaceAll("[^0-9.]", "");
double newprice  = Double.parseDouble(cleanedTextprice);
    System.out.println("Ціна товару : " +newprice);
    return this;

}
//    @FindBy(xpath = "//li[contains(@class,'menu-categories__item ng-star-inserted')]")
//    List<WebElement> allmenu;

//    public Mainpage getTextfromList() {
//        List<String> uniqueProductNames = allmenu.stream()
//                .map(WebElement::getText)
//                .distinct()
//                .collect(Collectors.toList());
//
//            for (String str : uniqueProductNames) {
//                List<Character> characters = str.chars() // Перетворюємо рядок у IntStream
//                        .mapToObj(c -> (char) c) // Перетворюємо IntStream у Stream<Character>
//                        .collect(Collectors.toList()); // Збираємо символи в список
//                characters.addAll(characters); // Додаємо символи до загального списку
//
//                // Використовуємо Set для видалення дублікатів
//                Set<Character> uniqueSet = new HashSet<>(characters);
//
//                // Виводимо унікальні символи
//            //    for (Character character : uniqueSet) {
           //         System.out.println(character);
//                }
//            }
//            return this;
//        }
//


    }










