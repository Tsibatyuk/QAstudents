package maksim.webtesting.tenSites.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import javax.swing.*;
import javax.swing.text.DateFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class LamdaPage extends BasePage {

    String validPassword = "481516nika";
    String validEmail = "Fisher481516@gmail.com";
    @FindBy(xpath = "//*[text()='Вхід']")
    private WebElement enter;

    public LamdaPage clicLogin() {
        click(enter);
        return this;
    }

    @FindBy(xpath = "//input[@id='loginform-login']")
    private WebElement login;

    public LamdaPage clicEmail() {
        click(login);
        login.sendKeys(validEmail);
        sleep(2);
        return this;
    }

    @FindBy(xpath = "//input[@id='loginform-password']")
    private WebElement pass;

    public LamdaPage clicPass() {
        click(pass);
        pass.sendKeys(validPassword);
        sleep(2);
        return this;
    }

    @FindBy(xpath = "//button[@class='btn-small auth-submit']")
    private WebElement buttonEnter;

    public LamdaPage clicButtonEnter() {
        click(buttonEnter);
        sleep(5);
        return this;
    }
    @FindBy(xpath = "//a[@class='h-m__item-link'][text()='Розклад']")
    private WebElement rozklad;

    public LamdaPage clicRozklad(){
        click(rozklad);
        return this;
    }
    @FindBy(xpath = "//a[@class='movie-name link-text mb-15'][text()='Мавка. Лісова пісня (0+)']")
    private WebElement mavka;
    @FindBy(xpath = "//div[@class='mat-radio-label-content'][text()=' завтра ']")
    private WebElement tomorow;
    public LamdaPage clicMavka(){
        click(mavka);
        sleep(4);
        scroll(200);
        sleep(3);
        click(tomorow);
        return this;
    }
    @FindBy(xpath = "//button[@class='chips']")
    private WebElement ticket;
    @FindBy(xpath = "//div[@class='hall__seat']")
    private List<WebElement>seat;
    @FindBy(xpath = "//div[@class='add-to-cart__content-left']")
    private List<WebElement>atToCart;
    @FindBy(xpath = "//button[@class='add-to-cart mb-30 test2 ng-star-inserted']")
    private WebElement pay;
    public LamdaPage clicTicket(){
        click(ticket);
        sleep(7);
        click(seat.get(0));
        sleep(2);
        click(atToCart.get(0));
        click(pay);
        sleep(5);
        LambdaInterface vv = () -> System.out.println("dsfgj");{
            System.out.println(vv);
        }
        return this;
    }



        }







