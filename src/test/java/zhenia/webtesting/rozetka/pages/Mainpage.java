package zhenia.webtesting.rozetka.pages;

import driver.DriverPoll;
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
}
