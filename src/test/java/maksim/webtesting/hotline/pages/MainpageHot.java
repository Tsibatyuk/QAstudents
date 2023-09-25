package maksim.webtesting.hotline.pages;

import driver.DriverPoll;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.BasePage;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class MainpageHot extends BasePage {

    public MainpageHot openHotline() {
        DriverPoll.getDriver().get("https://hotline.ua/");
        return this;
    }

    @FindBy(xpath = "//div[@class='user-button__image flex middle-xs center-xs']")
    private WebElement in;

    public MainpageHot SingUp() {
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

    public MainpageHot pystePole() {
        checkThatFieldIsEmpty(poleEmail);
        checkThatFieldIsEmpty(polePass);
        return this;
    }

    String validEmail = "fisher481516@gmail.com";
    String validPass = "12345678Nika";
    String inValidEmail = "asdfdsf@nbbj.com";
    String invalidPss = "87654543ffvgvg";

    public MainpageHot singIn() {
        click(syka);
        click(poleEmail);
        poleEmail.sendKeys(validEmail);
        click(polePass);
        polePass.sendKeys(validPass);
        click(sendBtn);
        click(notbot);
        return this;
    }

    @FindBy(xpath = "//div[@class='lang-button flex middle-xs center-xs header__lang-icon']")
    private WebElement languageButton;
    @FindBy(xpath = "//div[@class='lang-item'][1]")
    private WebElement ua;
    @FindBy(xpath = "//div[@class='button-menu-main ']")
    private WebElement catalogButton;

    public MainpageHot hotlineUACatalog() {
        try {
            openHotline();
            String language = languageButton.getText();
            if (language.contains("UA")) {
                click(catalogButton);
            } else {
                click(languageButton);
                click(ua);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return this;
    }

    @FindBy(xpath = "//li[@class='menu-main__item']")
    private List<WebElement> listCatecorii;

    @DataProvider(name = "data")
    public Object[][] data() {
        return listArray();
    }

    public String[][] listArray() {
        String[][] element = new String[listCatecorii.size()][1];
        for (int i = 0; i < listCatecorii.size(); i++) {
            WebElement text = listCatecorii.get(i);
            element[i][0] = text.getText();
        }
        return element;
    }

    @FindBy(xpath = "//span[@class='text'][text()='Зоотовари']")
    private WebElement zootovary;

    public MainpageHot assertColor() {
        openHotline();
        sleep(2);
        String expectedResalt = zootovary.getCssValue("color");
        Actions actions = new Actions(DriverPoll.getDriver());
        actions.moveToElement(zootovary).perform();
        String actualResalt = zootovary.getCssValue("color");

        if (expectedResalt.equals(actualResalt)) {
            System.out.println("Очікуване значення кольору: " + expectedResalt);
            System.out.println("Фактичне значення кольору: " + actualResalt);
        }
        Assert.assertNotEquals(actualResalt, expectedResalt, "Pidaras");
        System.out.println("Pidarasina");
        return this;
    }
}



