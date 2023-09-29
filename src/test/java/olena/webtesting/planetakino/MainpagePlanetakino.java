package olena.webtesting.planetakino;

import driver.DriverPoll;
import maksim.learning.W;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import pages.BasePage;

import java.util.*;
import java.util.stream.Collectors;

import static org.apache.commons.lang3.CharSetUtils.count;

public class MainpagePlanetakino extends BasePage {
    public MainpagePlanetakino openPlanetakino() {
        DriverPoll.getDriver().get("https://planetakino.ua/");
        sleep(5);
        return this;
    }

    @FindBy(xpath = "//a[@class='h-m__item-link'][text()='ЩОСЬ']")
    private WebElement item;

    public MainpagePlanetakino cssPlanetaKino() {
        String cssPlanetaKino1 = item.getCssValue("color");
        System.out.println(cssPlanetaKino1);
        Actions actions = new Actions(DriverPoll.getDriver());
        actions.moveToElement(item).perform();
        String cssPlanetaKino2 = item.getCssValue("color");
        System.out.println(cssPlanetaKino2);
        Assert.assertNotEquals(cssPlanetaKino1, cssPlanetaKino2);
        System.out.println("Колір змінився");
        return this;
    }

    @FindBy(xpath = "//div[@class='bwc-msg']")
    private WebElement iFrame;
    @FindBy(xpath = "//div[@id='bwc-chat-cloud-message']/button")
    private WebElement closeIframe;

    public MainpagePlanetakino iframePlanetakino() {
        Actions actions = new Actions(DriverPoll.getDriver());
        actions.moveToElement(item).perform();
        sleep(4);
        DriverPoll.getDriver().switchTo().frame(iFrame);
        click(closeIframe);
        DriverPoll.getDriver().switchTo().defaultContent();
        return this;
    }

    @FindBy(xpath = "//ul[@class='h-m__desktop']")
    private List<WebElement> desktop;

    public MainpagePlanetakino desktopPlaneta() {
//        List<String> menu = desktop.stream()
//                .map(WebElement::getText)
//                .collect(Collectors.toList());
        List<WebElement> menuItems = desktop.get(0).findElements(By.tagName("li"));
        for (WebElement xpath : menuItems) {
            String text = xpath.getText();
            if (!text.trim().isEmpty())
                System.out.println("Кількість символів у елементі: " + text + " = " + text.length());
        }
        return this;
    }

    @FindBy(xpath = "//li[@class='h-m__item'][9]")
    private WebElement li;
    @FindBy(xpath = "//ul[@class='addon-menu addon-menu_h-m']")
    private List<WebElement> menu1;

    public MainpagePlanetakino clackLi() {
        click(li);
        List<WebElement> menu2 = menu1.get(0).findElements(By.tagName("li"));
        for (WebElement item1 : menu2) {
            String text1 = item1.getText();
            if (!text1.trim().isEmpty())
                System.out.println("Кількість символів у елементі: " + text1 + " = " + text1.length());
        }
        return this;
    }

    @FindBy(xpath = "//a[@class='h-m__item-link'][text()='Розклад']")
    private WebElement schedule;
    @FindBy(xpath = "//section[@class='movies']")
    private List<WebElement> movies;
    @FindBy(xpath = "//a[@class='movie-name link-text mb-15']")
    private List<WebElement> title;

    public MainpagePlanetakino streamKino() {
        click(schedule);
        sleep(2);
        List<String> title21 = title.stream()
                .map(WebElement::getText)
                .map(s -> s.replaceAll("[^а-ґяіїАІЇ-ЯҐ]", " "))
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());

        for (String x : title21) {
            System.out.println(x);
        }
        return this;
    }

    @FindBy(xpath = "//a[@class='h-m__item-link'][text()='4DX']")
    private WebElement fourDX;
    @FindBy(xpath = "//div[@class='parallax_text']")
    private List<WebElement> text4DX;

    public MainpagePlanetakino streamfourDX() {
        click(fourDX);
        sleep(2);
        List<String> text = text4DX.stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());

        for (String text1 : text) {
            System.out.println(text1);
        }
        return this;
    }

    @FindBy(xpath = "//div[@class='filter-group']//mat-checkbox[@class='mat-checkbox mat-accent']")
    private List<WebElement> clikfiltr1;

    public MainpagePlanetakino clikFiltr() {
        click(schedule);
        sleep(4);
        List<WebElement> elementsToClick = clikfiltr1;
        elementsToClick.forEach(element -> {
            element.click();
            sleep(3);
        });

        // Додайте інші дії, якщо потрібно, після кожного кліку);
        return this;
    }

    @FindBy(xpath = "//button[@class='chips']")
    private List<WebElement> chips;

    public MainpagePlanetakino reduce() {
        click(schedule);
        List<String> chip = chips.stream()
                .map(WebElement::getText)
                .reduce((result, elementText) -> result + elementText)
                .stream().toList();
        System.out.println(chip);
        long chip1 = chips.stream()
                .count();
        System.out.println("Кількість символів : " + chip1);
        List<String> chip2 = chips.stream()
                .map(WebElement ::getText)
                .distinct()
                .sorted().toList();
        System.out.println(chip2);
        Optional<String> chip3 = chips.stream()
                .map(WebElement ::getText)
                .findFirst();
        System.out.println(chip3);
        List<String> chip4 = Collections.singletonList(chips.stream()
                .map(WebElement::getText)
                .min(Comparator.comparingInt(String::length))
                .orElse(null));
        System.out.println(chip4);
       boolean chip5 = chip.stream()
               .allMatch(text -> !((String) text).isEmpty());
        if (chip5) {
            System.out.println("Всі елементи мають текстовий вміст.");
        } else {
            System.out.println("Не всі елементи мають текстовий вміст.");
        }

        return this;
    }
}