package oleksandr.webtesting.pogoda.pages;

import driver.DriverPoll;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class PagesWeather extends BasePage {
    public PagesWeather openGoogle(){
        DriverPoll.getDriver().get("https://www.google.com.ua/?hl=uk");
        return  this;
    }
    @FindBy(xpath = "//*[@id='APjFqb']")
    private WebElement stroka;

    public PagesWeather strikaGoogle(){
        setValue(stroka,"погода");
        sleep(2);
        setValue(stroka, Keys.ESCAPE.toString());
        return this;
    }
    @FindBy(xpath = "//div[@class='FPdoLc lJ9FBc']//*[@class='gNO89b']")
private WebElement entergoogle;
    public PagesWeather enterSerch(){
        click(entergoogle);
    sleep(3);
    return  this;
    }

}
