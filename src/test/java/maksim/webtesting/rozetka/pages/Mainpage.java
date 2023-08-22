package maksim.webtesting.rozetka.pages;

import driver.DriverPoll;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasePage;

public class Mainpage extends BasePage {
    @Test
    public Mainpage openrozetka (){
        DriverPoll.getDriver().get("https://rozetka.com.ua/");
        return this;
    }
    public Mainpage asserturl(){
        Assert.assertEquals(DriverPoll.getDriver().getCurrentUrl(),"https://rozetka.com.ua/ua/");
        return this;

    }
}
