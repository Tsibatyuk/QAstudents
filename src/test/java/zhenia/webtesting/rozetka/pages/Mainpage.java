package zhenia.webtesting.rozetka.pages;

import driver.DriverPoll;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import pages.BasePage;
import utiles.Config;

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

@FindBy(xpath = "//button[@id='fat-menu']")
private WebElement fatMenuBtn;

public Mainpage checkTheLanguge(){
    try {
        click(waitUntilElementToBeClickableByXpath(String.valueOf(ukrBtn)));
    }catch(Exception e){
        click(fatMenuBtn);
    }
    return this;
}

}
