package olena.google.pages1;


import driver.DriverPoll;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasePage;

import javax.swing.*;
import java.security.cert.Extension;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Mainpage1 extends BasePage {
    public Mainpage1 openGoogle() {
        DriverPoll.getDriver().get("https://www.google.com");
        sleep(5);
return this;
    }
@FindBy(xpath = "//textarea[@class='gLFyf']")
    private WebElement write;
    public Mainpage1 writeInGoogle(){
        setValue(write, "Hello Adele");
        sleep(2);
        setValue(write, Keys.ESCAPE.toString());
        sleep(2);
        return this;
    }
@FindBy(xpath = "//div[@class='FPdoLc lJ9FBc']//input[@class='gNO89b']")
    private WebElement enterGoogle;
    public Mainpage1 enterSearch(){
        click(enterGoogle);
        sleep(5);
        return this;

    }




}