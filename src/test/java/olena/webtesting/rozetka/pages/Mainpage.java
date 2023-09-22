package olena.webtesting.rozetka.pages;

import driver.DriverPoll;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import pages.BasePage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Mainpage extends BasePage {

    public Mainpage openUrl(String siteUrl) {
        DriverPoll.getDriver().get(siteUrl);
        return this;


    }

    @FindBy(xpath = "//button[contains(@id,'fat-menu')]")
    private WebElement fatMenuBtn;

    public Mainpage cliktomenubutton() {
        click(fatMenuBtn);
        sleep(2);
        return this;
    }

    public Mainpage assertUrl() {
        Assert.assertEquals(DriverPoll.getDriver().getCurrentUrl(), "https://rozetka.com.ua/ua/");
        return this;
    }

    @FindBy(xpath = "//*[@id='fat-menu']")
    private WebElement fatmenu;


    @FindBy(xpath = "//li[contains(@class,'menu-categories__item ng-star-inserted')]")
    List<WebElement> listmenucategories;

    public Mainpage printUniqueProductNames() {
        List<String> nazva = new ArrayList<>();
        for (int i = 0; i < listmenucategories.size(); i++) {
            nazva.add(listmenucategories.get(i).getText());
            System.out.println(nazva.get(i));
        }


//        List<String> uniqueProductNames = listmenucategories.stream()
//                .map(WebElement::getText)
//                .distinct()
//                .collect(Collectors.toList());
//
//        for (String productName : uniqueProductNames) {
//            System.out.println(productName);
//        }
        return this;
    }

    //div[@class='menu-wrapper menu-wrapper_state_animated']//*[.='Спорт і захоплення']
    @FindBy(xpath = "//div[contains(@class,'animated')]//*[.='Спорт і захоплення']")
    private WebElement sport;

    public Mainpage cliksport() {
        click(sport);

        return this;

    }

    @FindBy(xpath = "//div[contains(@class,'animated')]//*[.='Ноутбуки та комп’ютери']")
    private WebElement computer;

    public Mainpage clikcomputer() {
        click(computer);

        return new Mainpage();
    }

    @FindBy(xpath = "//ul[@class='menu-categories ng-star-inserted']/li/a")
    public List<WebElement> cycle;


    public Mainpage clickCycleForDirectoryXpath(int y) {
        click(cycle.get(y));
        return this;
    }

    public void clickCycle(int y) {
        click(cycle.get(y));
    }

    public Mainpage textCycleForDirectoryXpath(int i, List<String> u) {
        u.add(cycle.get(i).getText());
        return this;
    }

    List<String> cycle2 = new ArrayList<>();


    public void forCycle() {
        int nam = cycle.size();
        for (int i = 0; i < nam; i++) {
            textCycleForDirectoryXpath(i, cycle2);
            System.out.println(cycle2.get(i));
//            System.out.println(cycle.get(i).getText());
            clickCycle(i);
            sleep(1);
            goBack();
            cliktomenubutton();
        }
    }

    @FindBy(xpath = "//*[@class='header__button ng-tns-c59-1']")
    private WebElement menu;

    public Mainpage clikMenu() {
        click(menu);
        sleep(4);
        return this;
    }

    @FindBy(xpath = "//div[@data-goods-id='391643262'][@class='goods-tile__inner']")
    private WebElement thisLaptop;

    @FindBy(xpath = "//p[@class='product-price__big product-price__big-color-red']")
    private WebElement price;
    @FindBy(xpath = "//img[contains(@alt,'Ноутбуки')]")
    private WebElement clikLaptop;

    @FindBy(xpath = "//a[@data-id='Apple']")
    private WebElement filter;


    public Mainpage laptopApple() {
        click(clikLaptop);
        sleep(2);
        filter.click();
        sleep(10);
        return this;
    }

    @FindBy(xpath = "//a[@class='checkbox-filter__link']")
    private List<WebElement> filterLoptop;

    public Mainpage filterLoptop1() {
        click(clikLaptop);
        System.out.println(filterLoptop.get(1).getText());
        List<String> filtr = filterLoptop.stream()
                .map(WebElement::getText) // Use getText() method to extract text
                .collect(Collectors.toList());
        filtr.forEach(System.out::println);

        return this;
    }

    public Mainpage laptop() {
        click(clikLaptop);
        sleep(5);
        scroll(800);
        sleep(2);
        click(thisLaptop);
        sleep(2);
        String priceText = price.getText();

        // Видаляємо з тексту всі символи, окрім цифр та крапки (якщо вона є).
        String cleanedPriceText = priceText.replaceAll("[^0-9.]", "");

        // Перетворюємо текст у числовий формат.
        double numericPrice = Double.parseDouble(cleanedPriceText);

        // Виводимо цю ціну в термінал.
        System.out.println("Ціна товару: " + numericPrice);

        return this;
    }

    @FindBy(xpath = "(//button[@class='header__button ng-star-inserted'])[1]")
    private WebElement clikLogin;

    @FindBy(xpath = "//input[@id='auth_email']")
    private WebElement usernameField;

    @FindBy(xpath = "//input[@class='ng-untouched ng-pristine ng-invalid']")
    private WebElement passwordField;

    @FindBy(xpath = "//button[@class='button button--large button--green auth-modal__submit ng-star-inserted']")
    private WebElement enterButton;

    public Mainpage enterButtonLogin() {
        click(enterButton);
        sleep(6);
        return this;
    }

    @FindBy(xpath = "//div[@class='recaptcha-checkbox-borderAnimation']")
    private WebElement notRobot;

    public Mainpage notRobotLogin() {
        click(notRobot);
        sleep(5);
        return this;
    }

    public Mainpage clikLoginRozetka() {

        click(clikLogin);
        sleep(1);
//        usernameField.sendKeys("рпарп");
        passwordField.click();
        sleep(3);
        checkThatFieldIsEmpty(usernameField);
        checkThatFieldIsEmpty(passwordField);
        return this;
    }

    public Mainpage desolateField() {
        click(clikLogin);
        sleep(1);
        usernameField.sendKeys("+380939816044");
        click(passwordField);
        passwordField.sendKeys("Qwerty777");


        sleep(3);


        return this;
    }

    public Mainpage webElement() {
        List<String> listSectoins = listmenucategories.stream()
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

    public Mainpage qqq() {
        List<String> ysrisy = listmenucategories.stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());
        for (String qwe : ysrisy) {
            List<Character> characters = qwe.chars()
                    .mapToObj(c -> (char) c)
                    .collect(Collectors.toList());
            characters.addAll(characters);
            Set<Character> www = new HashSet<>(characters);
            for (Character character : www) {
                System.out.println(character);
            }
        }

        return this;
    }

    @FindBy(xpath = "//a[@ class='menu-categories__link js-menu-categories__link']")
    private List<WebElement> openGarden;

    @FindBy(xpath = "//a[@ class='tile-cats__heading ng-star-inserted']")
    private List<WebElement> catalogGarden;

    public Mainpage rozetkaGarden() {
        click(openGarden.get(6));
        sleep(3);
        scroll(800);
        System.out.println(catalogGarden.get(1).getText());
        List<String> garden = catalogGarden.stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());
        garden.forEach(System.out::println);

        return this;
    }

}