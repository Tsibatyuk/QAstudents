package oleksandr.webtesting.hotline.hotlinePages;

import driver.DriverPoll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.DataProvider;
import pages.BasePage;

import java.util.List;

public class HotlinePage extends BasePage {
    public HotlinePage openHotline() {
        DriverPoll.getDriver().get("https://hotline.ua/");
        return this;
    }

    public HotlinePage checkTheSections(String t){
        String xpathText = String.format("//*[contains(text(),'%s')]", t);
click(DriverPoll.getDriver().findElements(By.xpath(xpathText)).get(0));
        return  this;
    }

    @FindBy(xpath = "//div[@class='lang-button flex middle-xs center-xs header__lang-icon']")
    private WebElement UKlanguage;
    @FindBy(xpath = "//div[@class='lang-item'][contains(text(),'UA')]")
    private WebElement UK1;
    @FindBy(xpath = "//div[@class='header-catalog-button']")
    private WebElement katalotovar;

    public HotlinePage clickUA() {
        click(UKlanguage);
        try {click(UK1);
        } catch (Exception e) {
            click(UKlanguage);;
        }
        return this;
    }

    @FindBy(xpath = "//li[@class='menu-main__item']")
    List<WebElement> elements;
    @DataProvider(name = "testData")
    public String[][] masiv26() {
        String[][] text26 = new String[elements.size()][1];
        for (int i = 0; i < elements.size(); i++) {
            WebElement element = elements.get(i);
            String text = element.getText().replaceAll("\\s", "");
            text26[1][0] = text;
        }
        return text26;
    }




    public static  void  main(String[] args){
        String name = "жопочес";
        int age =25;
        String alex = String.format("У макса %s.Глистов %d шт",name,age);
        System.out.println(alex);
    }
}
