package maksim.webtesting.tenSites.page;

import driver.DriverPoll;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import pages.BasePage;

import java.util.List;
import java.util.stream.Collectors;

public class Page extends BasePage {
    public Page openDate() {
        DriverPoll.getDriver().get("https://uk.todaysdate365.com");
        sleep(4);
        return this;
    }

    @FindBy(xpath = "//li[text()='20 Вересень 2023']")
    private WebElement date;

    public Page dateparseInt() {
        String parsedate = date.getText().replaceAll("[^0-9]", "").substring(4);
        int parsedate1 = Integer.parseInt(parsedate);
        System.out.println(parsedate);
        return this;
    }

    public Page openKino() {
        DriverPoll.getDriver().get("https://planetakino.ua/");
        return this;
    }

    @FindBy(xpath = "//ul[@class='h-m__desktop']//a[text()='Контакти']")
    private WebElement contacts;
    @FindBy(xpath = "//div[@class='ct-page__info-el-middle']")
    private List<WebElement> num;

    public Page upNum() {
        click(contacts);
        sleep(3);
        String number = num.get(2).getText().replaceAll("[^0-9]", "").substring(1);
        int num1 = Integer.parseInt(number);
        System.out.println(number);
        return this;
    }

    @FindBy(xpath = "//a[@class='h-m__item-link'][text()='ЩОСЬ']")
    private WebElement something;

    public Page some() {
        sleep(3);
        String expectedResalt = something.getCssValue("color");
        System.out.println(expectedResalt);
        Actions actions = new Actions(DriverPoll.getDriver());
        actions.moveToElement(something).perform();
        sleep(2);
        String actualResalt = something.getCssValue("color");
        System.out.println(actualResalt);
        Assert.assertNotEquals(actualResalt, expectedResalt, "Не змінився колір");
        System.out.println();
        return this;
    }

    @FindBy(xpath = "//iframe[@id='bwc-iframe-sounds']")
    private WebElement iFrame;
    @FindBy(xpath = "//div[@id='bwc-chat-cloud-message']/button")
    WebElement iframeclose;

    public Page closeIframe() {
        Actions actions = new Actions(DriverPoll.getDriver());
        actions.moveToElement(something).perform();
        sleep(7);
        DriverPoll.getDriver().switchTo().frame(iFrame);
        sleep(2);
        click(iframeclose);
        DriverPoll.getDriver().switchTo().defaultContent();
        sleep(2);
        return this;
    }

    @FindBy(xpath = "//li[@class='h-m__item']")
    List<WebElement> desktop;

    public Page listTop() {
        List<String> top = desktop.stream().map(WebElement::getText).collect(Collectors.toList());
        System.out.println(top);
        List<Integer> size = top.stream()
                .mapToInt(String::length)
                .boxed()
                .collect(Collectors.toList());
        size.forEach(count -> System.out.println("Кількість символів: " + count));
        return this;
    }
}
