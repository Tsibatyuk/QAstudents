package oleksandr.webtesting.pogoda.pages;

import driver.DriverPoll;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

public class PagesWeather extends BasePage {
    public PagesWeather openGoogle() {
        DriverPoll.getDriver().get("https://www.google.com.ua/?hl=uk");
        return this;
    }

    @FindBy(xpath = "//*[@id='APjFqb']")
    private WebElement stroka;

    public PagesWeather strikaGoogle() {
        setValue(stroka, "погода");
        sleep(2);
        setValue(stroka, Keys.ESCAPE.toString());
        return this;
    }

    @FindBy(xpath = "//div[@class='FPdoLc lJ9FBc']//*[@class='gNO89b']")
    private WebElement entergoogle;

    public PagesWeather enterSerch() {
        click(entergoogle);
        sleep(3);
        return this;
    }

    @FindBy(xpath = "//*[text()='sinoptik.ua']")
    private List<WebElement> ckiksinoptik;

public PagesWeather sinoptik(){
    scroll(300);
       click(ckiksinoptik.get(0));
        return this;
}

    @FindBy(xpath = "//p[@class='today-temp']")
    private WebElement bringOut;

    public PagesWeather todaysweather() {
        String newtemperatur = bringOut.getText().replaceAll("[^\\d]", "");
        int newtemperatur1 = Integer.parseInt(newtemperatur);
        if (newtemperatur1 >20){
            System.out.println("[холодно");
        }
        System.out.println(newtemperatur);
        return this;
    }

}