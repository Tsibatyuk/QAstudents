package maksim.webtesting.tenSites.page;

import driver.DriverPoll;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
import pages.BasePage;

import java.util.List;

public class Page extends BasePage {
    public Page openDate(){
        DriverPoll.getDriver().get("https://uk.todaysdate365.com");
        sleep(4);
        return this;
    }
@FindBy(xpath = "//li[text()='20 Вересень 2023']")
    private WebElement date;
    public Page dateparseInt(){
        String parsedate = date.getText().replaceAll("[^0-9]" ,"").substring(4);
        int parsedate1 = Integer.parseInt(parsedate);
        System.out.println(parsedate);
        return this;
    }
   public Page openKino(){
        DriverPoll.getDriver().get("https://planetakino.ua/");
        return this;
   }
@FindBy(xpath = "//ul[@class='h-m__desktop']//a[text()='Контакти']")
private WebElement contacts;
@FindBy(xpath = "//div[@class='ct-page__info-el-middle']")
    private List<WebElement> num;
    public Page upNum(){
        click(contacts);
        sleep(3);
        String number = num.get(2).getText().replaceAll("[^0-9]","").substring(1);
        int num1 = Integer.parseInt(number);
        System.out.println(number);
        return this;
    }
}
