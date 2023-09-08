package maksim.webtesting.rozetka.pages;

import driver.DriverPoll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasePage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Mainpage extends BasePage {
    @Test
    public Mainpage openrozetka() {
        DriverPoll.getDriver().get("https://rozetka.com.ua/");
        return this;
    }

    public Mainpage asserturl() {
        Assert.assertEquals(DriverPoll.getDriver().getCurrentUrl(), "https://rozetka.com.ua/ua/");
        return this;

    }

    @FindBy(xpath = "//*[@id='fat-menu']")
    private WebElement mbutton;

    public Mainpage clicbtn() {
        click(mbutton);
        return new Mainpage();

    }

    @FindBy(xpath = "//*[contains(@class,'menu-categories__item ng-star-inserted')]")
    private WebElement cat;

    public Mainpage categ() {
        click(cat);
        return this;
    }

    @FindBy(xpath = "//li[contains(@class,'menu-categories__item ng-star-inserted')]")
    List<WebElement> ca;

    public Mainpage listrrr() {
        List<String> web = new ArrayList<>();
        for (int i = 0; i < ca.size(); i++) {
            web.add(ca.get(i).getText());
            System.out.println(web.get(i));
        }
        return this;
    }

    //a[@class='menu-categories__link js-menu-categories__link menu-categories__link_state_hovered']
//@FindBy(xpath ="//a[text()='Спорт і захоплення']")
//List <WebElement> sport;
//    public Mainpage gogi(){
//        click(sport.get(0));
//        return this;
//}

    @FindBy(xpath = "//a[@class='menu-categories__link js-menu-categories__link']")
    private WebElement sport;

    public Mainpage clksport() {
        click(sport);
        return this;
    }

    @FindBy(xpath = "//li[@class='lang__item lang-header__item lang-header__item_state_active ng-star-inserted']")
    private WebElement ukrBtn;

    public Mainpage checkTheLanguge() {
        try {
            click(waitUntilElementToBeClickableByXpath(String.valueOf(ukrBtn)));
        } catch (Exception e) {
            click(ukrBtn);
        }
        return this;
    }

    @FindBy(xpath = "//*[@href='#icon-user-simple']")

    private WebElement rz;

    public Mainpage log() {
        click(rz);
        return this;

    }

    @FindBy(xpath = "//*[@id='auth_email']")
    private WebElement email;
    @FindBy(xpath = "//*[@id='auth_pass']")
    private WebElement password;

    public Mainpage emptyfield() {
        checkThatFieldIsEmpty(email);
        checkThatFieldIsEmpty(password);
        return this;
    }

    String validEmail = "fisher481516@gmail.com";
    String inValidEmail = "fishejfcdgdx6@gmail.com";
    String validPassword = "1234567Nika";
    String inValidPassword = "12zdfmngaiubtika";

    @FindBy(xpath = "//*[@class='button button--large button--green auth-modal__submit ng-star-inserted']")
    private WebElement sendBtn;

    public Mainpage reestr() {
        click(email);
        email.sendKeys(validEmail);
        click(password);
        password.sendKeys();
        click(sendBtn);
        return this;

    }

    @FindBy(xpath = "//div[@class='recaptcha-checkbox-border']")
    private WebElement bot;

    public Mainpage notbot() {
        sleep(2);
        click(bot);
        return this;
    }

    @FindBy(xpath = "//li[contains(@class,'menu-categories__item ng-star-inserted')]")
    private List<WebElement> lists;

    public Mainpage webElement() {

        List<String> listSectoins = lists.stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());

        for (String str : listSectoins) {
            List<Character> characters = str.chars()
                    .mapToObj(c -> (char) c)
                    .collect(Collectors.toList());
            characters.addAll(characters);

            Set<Character> uniqueSet = new HashSet<>(characters);

            for (Character character : uniqueSet) {
                System.out.println(character);
            }
        }
        return this;

        }
    }


//зайти на сайт погоди дістати значення погоди перевести в числове значення (якщо погода така тотакий текст можно через сві кейс)
//



