package olena.webtesting.google;

import driver.DriverPoll;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
import pages.BasePage;


public class MainpageTest extends BasePage {
    public MainpageTest openSait() {
        DriverPoll.getDriver().get("https://hotline.ua/");
        sleep(2);
        return this;
    }

    @FindBy(xpath = "//div[@class='search-section__text']")
    private WebElement qqqqq;

    public MainpageTest figureHotlaine() {
        String figureHotlaineTest = qqqqq.getText().replaceAll("\\D+", "").substring(3);
//        if (figureHotlaineTest.length() > 3) {
//            figureHotlaineTest = figureHotlaineTest.substring(3);
//        } else {
//            figureHotlaineTest = "";
//        }
        int digit = Integer.parseInt(figureHotlaineTest);
        System.out.println(digit);
        return this;
    }

    public MainpageTest openSai() {
        DriverPoll.getDriver().get("https://rozetka.com.ua/");
        sleep(2);
        return this;
    }

    @FindBy(xpath = "//span[@class='main-slider__pagination-quantity']")
    private WebElement eee;

    public MainpageTest figureRozetka() {
        String figureRozetkaTest = eee.getText().replace("\\D+", "").substring(1);
        int digit1 = Integer.parseInt(figureRozetkaTest);
        System.out.println(digit1);
        return this;
    }

    public MainpageTest openSa() {
        DriverPoll.getDriver().get("https://trc-terminal.com.ua/");
        sleep(2);
        return this;
    }

    @FindBy(xpath = "//ul[@class='main-menu']//a[text()='Контакти']")
    private WebElement rrr;
    @FindBy(xpath = "//section[@class='inv-widget-categories']")
    private WebElement ttt;

    public MainpageTest figureTerminal() {
        click(rrr);
        sleep(3);
        String figureTerminalTest = ttt.getText().replaceAll("\\D+","").substring(100);
        long digit2 = Integer.parseInt(figureTerminalTest);
        System.out.println(digit2);
        return this;
    }


}