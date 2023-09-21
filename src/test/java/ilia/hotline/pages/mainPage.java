package ilia.hotline.pages;

import driver.DriverPoll;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import pages.BasePage;

import java.util.*;
import java.util.stream.Collectors;

public class mainPage extends BasePage
{
    public mainPage openHotline()
    {
        DriverPoll.getDriver().get("https://hotline.ua/");
        return this;
    }
    public mainPage assertUrl()
    {
        Assert.assertEquals(DriverPoll.getDriver().getCurrentUrl(), "https://hotline.ua/?gclid=CjwKCAjwjOunBhB4EiwA94JWsIbkHmB1JQd7iPFxXGZO4blgMF3NdIGuE_jGGEe1ny7JmCRJy7YO8xoCz8oQAvD_BwE");
        return this;
    }
}
