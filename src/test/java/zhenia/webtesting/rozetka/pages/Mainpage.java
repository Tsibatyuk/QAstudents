package zhenia.webtesting.rozetka.pages;

import driver.DriverPoll;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import pages.BasePage;
import utiles.Config;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Mainpage extends BasePage {

public Mainpage openRozetka(){
    DriverPoll.getDriver().get("https://rozetka.com.ua/");
    return this;
}
public Mainpage assertUrl(){
    Assert.assertEquals(DriverPoll.getDriver().getCurrentUrl(), "https://rozetka.com.ua/ua/");
    return this;
}
@FindBy(xpath = "//li[@class='lang__item lang-header__item lang-header__item_state_active ng-star-inserted']")
private WebElement ukrBtn;

@FindBy(xpath = "//*[text()='Ноутбуки та комп’ютери']")
private List<WebElement> komp;
public Mainpage clickToCompSection(){
    click(komp.get(1));
    return this;
}


@FindBy(xpath = "//button[@id='fat-menu']")
private WebElement fatMenuBtn;

    @FindBy(xpath ="//li[contains(@class,'menu-categories__item ng-star-inserted')]")
    List<WebElement> listOfProducts;

    public Mainpage getTextFromList() {
        List<String> newlist = new ArrayList<>();
        newlist.forEach(lis->{
//            newlist.add(listOfProducts.get(Integer.parseInt(i)).getText());
        });

//        for (int i = 0; i < listOfProducts.size(); i++) {
//            newlist.add(listOfProducts.get(i).getText());
//            System.out.println(newlist.get(i));
//        }
        return this;
    }
//        List<String> uniqueProductNames = listOfProducts.stream()
//                .map(WebElement::getText)
//                .distinct()
//                .collect(Collectors.toList());
//
//        for (String productName : uniqueProductNames) {
//            System.out.println(productName);

//        }
//        return this;
        //}
        public Mainpage checkTheLanguge () {
            try {
                click(waitUntilElementToBeClickableByXpath(String.valueOf(ukrBtn)));
            } catch (Exception e) {
                click(fatMenuBtn);
            }
            return this;
        }

    }
