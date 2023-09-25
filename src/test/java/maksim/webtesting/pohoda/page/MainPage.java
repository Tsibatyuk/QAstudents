package maksim.webtesting.pohoda.page;

import driver.DriverPoll;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class MainPage extends BasePage {
    public MainPage openSinoptik() {
        DriverPoll.getDriver().get("https://ua.sinoptik.ua/");
        return this;
    }

    @FindBy(xpath ="//p[@class='today-temp']")
    private WebElement temp;

    public MainPage checkTemperature() {
        String temperatureText = temp.getText().replaceAll("°" + "+" + "C", "");


        int temperatureText1 = Integer.parseInt(temperatureText);
        if (temperatureText1 > 20) {
            System.out.println("тепло");
        }
        else {
            System.out.println("погода так собі");}
        if(temperatureText1 < 20) {
                System.out.println("холодно");
            }
        else {
            System.out.println("погода так собі");}
            return this;
        }


    }
