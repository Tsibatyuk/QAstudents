package olena.webtesting.rozetka.pages;

import abstractpages.BasePage;
import driver.DriverPoll;
import org.testng.Assert;

import java.security.cert.Extension;

public class Mainpage extends BasePage {
    public Mainpage openrozetka() {
        DriverPoll.getDriver().get("https://rozetka.com.ua/");


        return this;


    }
    public Mainpage assertUrl(){
        Assert.assertEquals(DriverPoll.getDriver().getCurrentUrl(),"https://rozetka.com.ua/ua/");


        return this;


    }


}
