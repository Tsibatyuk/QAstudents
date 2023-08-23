package venya.webtesting.rozetka.pages.rozetka;

import driver.DriverPoll;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.Extension;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.reporters.jq.Main;
import pages.BasePage;

import java.util.ArrayList;
import java.util.List;
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

        for (String productName : uniqueProductNames) {
            System.out.println(productName);
        }
        return this;
    }

    //*[.='Спорт і захоплення']    //*[contains(.,'Спорт і захоплення')]
    @FindBy (xpath = "//*[text()='Спорт і захоплення']")
     List<WebElement> sport;

    public Mainpage clicksport (){
        click(sport.get(0));


        return this;
    }
    @FindBy(xpath = "//li[@class='lang__item lang-header__item lang-header__item_state_active ng-star-inserted']")
    private WebElement ukrBtn;
    public Mainpage checkTheLanguge(){
        try {
            click(waitUntilElementToBeClickableByXpath(String.valueOf(ukrBtn)));
        }catch(Exception e){
            click(fatmenu);
        }
        return this;
    }

}
