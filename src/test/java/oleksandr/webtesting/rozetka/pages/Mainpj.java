package oleksandr.webtesting.rozetka.pages;

import driver.DriverPoll;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasePage;

import java.security.cert.Extension;

public class Mainpj extends BasePage {

    public Mainpj openrozetka (){
        DriverPoll.getDriver().get("https://rozetka.com.ua");
        return this;
    }

public Mainpj assertUrl (){
    Assert.assertEquals(DriverPoll.getDriver().getCurrentUrl(),"https://rozetka.com.ua/ua/");
        return this;
}
}
