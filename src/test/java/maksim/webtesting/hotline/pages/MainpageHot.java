package maksim.webtesting.hotline.pages;

import driver.DriverPoll;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import pages.BasePage;

public class MainpageHot extends BasePage {

    public MainpageHot openHotline(){
        DriverPoll.getDriver().get("https://hotline.ua/");
        return this;
    }
    @FindBy(xpath = "//div[@class='user-button__image flex middle-xs center-xs']")
    private WebElement in;
    public MainpageHot SingUp(){
        click(in);
        return this;
    }
    @FindBy(xpath = "//input[@class='field m_b-sm']")
    private WebElement poleEmail;
    @FindBy(xpath = "//input[@class='field']")
    private WebElement polePass;

    @FindBy(xpath = "//input[@class='btn-graphite btn-cell']")
    private WebElement sendBtn;
@FindBy(xpath = "//button[@class='sub-dialog-btn allow_btn']")
private WebElement syka;
@FindBy(xpath = "//input[@type='checkbox']")
private WebElement notbot;

    public MainpageHot pystePole(){
        checkThatFieldIsEmpty(poleEmail);
        checkThatFieldIsEmpty(polePass);
        return this;
    }
    String validEmail = "fisher481516@gmail.com";
    String validPass = "12345678Nika";
    String inValidEmail = "asdfdsf@nbbj.com";
    String invalidPss = "87654543ffvgvg";

    public MainpageHot singIn(){
        click(syka);
        click(poleEmail);
        poleEmail.sendKeys(validEmail);
        click(polePass);
        polePass.sendKeys(validPass);
        click(sendBtn);
        click(notbot);
        return this;
    }

}
