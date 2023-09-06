package venya.google.Page;

import driver.DriverPoll;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import venya.webtesting.rozetka.pages.rozetka.Mainpage;

import java.sql.Driver;

public class Googlepage extends BasePage {
    public Googlepage openGo() {
        DriverPoll.getDriver().get("https://www.google.com.ua/");
        sleep(5);
        return this;
    }

    @FindBy(xpath = "//textarea[@class='gLFyf']")
    private WebElement writeGo;

    public Googlepage writeinGo() {
        setValue(writeGo, "Weather in Miami");
        sleep(3);
        setValue(writeGo, Keys.ESCAPE.toString());
        sleep(3);
        return this;
    }

    @FindBy(xpath = "//div[@class='FPdoLc lJ9FBc']//input[@class='gNO89b']")
    private WebElement enterGo;

    public Googlepage entersearchGo() {
        click(enterGo);
        sleep(3);
        return this;
    }

    @FindBy(xpath = "//div[@class = 'CCgQ5 vCa9Yd QfkTvb N8QANc MUxGbd v0nnCb']")
    private WebElement siteGo;

    public Googlepage Googlesite() {
        scroll(500);
        DriverPoll.getDriver().get("https://weather.com/weather/tenday/l/Miami+FL?canonicalCityId=c9d07351a6bbc498786bf52814f07b68fe43a40bfd634facef3db6b459321c41");
        scroll(1400);
        sleep(10);
        return this;
    }

    @FindBy(xpath = "//a[@class ='Footer--cmCtaButton--190d8 mediaCtaButton Button--primary--1eZwN']")
    private WebElement category;

    public Googlepage videos() {
        click(category);
        scroll(1400);
        sleep(2);
        return this;
    }

    @FindBy(xpath = "//a[@class ='Pagination--nextButton--3L5q9 Pagination--button--2Gb0n Button--default--2gfm1']")
    private WebElement next;

    public Googlepage nextbutton() {
        click(next);
        sleep(2);
        return this;
    }

    public Googlepage previouspage() {
        DriverPoll.getDriver().get(" https://weather.com/accessibility-statement");
        sleep(2);
        return this;

    }

}







