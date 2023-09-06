package venya.webtesting.rozetka.pages.rozetka;

import driver.DriverPoll;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.Extension;
import org.openqa.selenium.support.FindBy;
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

    @FindBy(xpath = "//li[contains(@class,'menu-categories__item ng-star-inserted')]")
    List<WebElement> allmenu;

    public Mainpage getTextfromList() {
        List<String> uniqueProductNames = allmenu.stream()
                .map(WebElement::getText)
                .distinct()
                .collect(Collectors.toList());

            for (String str : uniqueProductNames) {
                List<Character> characters = str.chars() // Перетворюємо рядок у IntStream
                        .mapToObj(c -> (char) c) // Перетворюємо IntStream у Stream<Character>
                        .collect(Collectors.toList()); // Збираємо символи в список
                characters.addAll(characters); // Додаємо символи до загального списку

                // Використовуємо Set для видалення дублікатів
                Set<Character> uniqueSet = new HashSet<>(characters);

                // Виводимо унікальні символи
                for (Character character : uniqueSet) {
                    System.out.println(character);
                }
            }
            return this;
        }



    }










