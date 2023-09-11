package oleksandr.webtesting.rozetka.pages;

import driver.DriverPoll;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import pages.BasePage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Mainpagerozetka extends BasePage {

    String url = "https://rozetka.com.ua";

    public Mainpagerozetka openrozetka() {
        DriverPoll.getDriver().get(url);
        return this;
    }

    @FindBy(xpath = "//button[@id='fat-menu']")
    private WebElement menuBTN;

    public Mainpagerozetka klaztomenuBaton() {
        click(menuBTN);
        return this;
    }

    public Mainpagerozetka assertUrl() {
        Assert.assertEquals(DriverPoll.getDriver().getCurrentUrl(), "https://rozetka.com.ua/ua/");
        return this;
    }

    @FindBy(xpath = "//li[contains(@class,'menu-categories__item ng-star-inserted')]")
    List<WebElement> katalog;

public  Mainpagerozetka  selectlatters() {
    List<String> categori = katalog.stream()
            .map(WebElement::getText)
            .collect(Collectors.toList());

    List<List<Character>> charList = new ArrayList<>();
    List<Character> chars = new ArrayList<>();
    Set<Character> uniqueLetters = new HashSet<>();

    for (String word: categori) {

        char[] chars1 = word.toCharArray();
        for (char c : chars1) {
            uniqueLetters.add(c);
            chars.add(c);
        }
    }
        System.out.println(uniqueLetters);
    return this;
    }






    public Mainpagerozetka lora() {
        List<String> killer = katalog.stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());
        killer.forEach(System.out::println);
        return this;
    }

    @FindBy(xpath = "//*[text()='Спорт і захоплення']")
    List<WebElement> sport;

    public Mainpagerozetka clickspot() {
        click(sport.get(0));
        return this;
    }

    @FindBy(xpath = "//li[@class='lang__item lang-header__item lang-header__item_state_active ng-star-inserted']")
    private WebElement ukrBtn;

    public Mainpagerozetka checkTheLanguge() {
                try {
                    click(waitUntilElementToBeClickableByXpath(String.valueOf(ukrBtn)));
                } catch (Exception e) {
                    click(menuBTN);
                }
                return this;
            }

    @FindBy(xpath = "//rz-user/button[@class='header__button ng-star-inserted']")
    private WebElement loginbtn;

    public Mainpagerozetka clicktologinbattn() {
        click(loginbtn);
        return this;
    }

    private String validEmail = "+380637029109";
    private String invalidEmail = "+37029109";
    private String validParol = "ykzdf7";
    private String invalidParol = "zdf7";
    private String textunderEmail = "Користувач з логіном " + invalidEmail + " не зареєстрований";

    @FindBy(id = "auth_email")
    private WebElement emeilfild;
    @FindBy(id = "auth_pass")
    private WebElement passwordfild;

@FindBy(xpath = "//a[@class='menu-categories__link js-menu-categories__link menu-categories__link_state_hovered']")
    private  WebElement newnout;
public Mainpagerozetka exitNotbook(){
    click(newnout);
    return  this;

}


// ...

    @FindBy(xpath = "//a[@class='menu-categories__link js-menu-categories__link menu-categories__link_state_hovered']")
    private WebElement newnout2;

    public Mainpagerozetka exitNotbook1() {
        for (int i = 0; i < 10; i++) {
            try{ click(newnout2);
                break;
            }catch(Exception e){
                scroll(500);
            }

        }

        return this;
    }


    // Метод для кліку на елементі
    public void click(WebElement element) {
        element.click();
    }

}




