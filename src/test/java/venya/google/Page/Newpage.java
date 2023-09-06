package venya.google.Page;

import driver.DriverPoll;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
import pages.BasePage;

public class Newpage extends BasePage {

    public Newpage Comfy;

    public Newpage openGoo() {
        DriverPoll.getDriver().get("https://www.google.com.ua/?hl=uk");
        sleep(3);
        return this;
    }

    @FindBy(xpath = "//textarea[@class='gLFyf']")
    private WebElement writeGoogle;


    public Newpage writeGoo() {
        setValue(writeGoogle, "Comfy");
        sleep(3);
        setValue(writeGoogle, Keys.ESCAPE.toString());
        sleep(3);
        return this;
    }

    @FindBy(xpath = "//div[@class='FPdoLc lJ9FBc']//input[@class='gNO89b']")
    private WebElement search;

    public Newpage Googlesearch() {
        click(search);
        sleep(3);
        return this;

    }

    @FindBy(xpath = "//div[@class = 'CCgQ5 vCa9Yd QfkTvb N8QANc MUxGbd v0nnCb']")
    private WebElement opencomfy;

    public Newpage opensite() {
        DriverPoll.getDriver().get("https://comfy.ua/ua/");
        sleep(3);
        scroll(700);
        return this;
    }
}
