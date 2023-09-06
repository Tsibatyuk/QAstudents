package olena.webtesting.google.pages1;


import driver.DriverPoll;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class Mainpage1 extends BasePage {




    public Mainpage1 openGoogle() {
        DriverPoll.getDriver().get("https://www.google.com");
        sleep(5);
        return this;
    }

    @FindBy(xpath = "//textarea[@class='gLFyf']")
    private WebElement write;

    public Mainpage1 writeInGoogle() {
        setValue(write, "Погода");
        sleep(2);
        setValue(write, Keys.ESCAPE.toString());
        return this;
    }
    @FindBy(xpath = "//div[@class='FPdoLc lJ9FBc']//input[@class='gNO89b']")
    private WebElement enterGoogle;

    public Mainpage1 enterSearch() {
        click(enterGoogle);
        sleep(2);
        return this;
    }
    @FindBy(xpath = "//span[@id='wob_tm']")
    private WebElement weather;

    public int getCurrentTemperature() {
        String temperatureText = weather.getText().replace("°", ""); // Отримуємо текст температури і видаляємо символ градуса.
        return Integer.parseInt(temperatureText);
    }

    public Mainpage1 displayWeatherOnGoogle() {
        int currentTemperature = getCurrentTemperature();

        if (currentTemperature > 20) {
            System.out.println("Жарко");
        } else if (currentTemperature > 5) {
            System.out.println("Прохолодно");
        } else {
            System.out.println("Холодно");
        }
        return this;
    }

}





