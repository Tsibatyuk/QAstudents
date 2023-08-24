package maksim.webtesting.rozetka.pages;

import driver.DriverPoll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasePage;

import java.util.ArrayList;
import java.util.List;

public class Mainpage extends BasePage {
    @Test
    public Mainpage openrozetka (){
        DriverPoll.getDriver().get("https://rozetka.com.ua/");
        return this;
    }
    public Mainpage asserturl(){
        Assert.assertEquals(DriverPoll.getDriver().getCurrentUrl(),"https://rozetka.com.ua/ua/");
        return this;

    }
    @FindBy(xpath = "//*[@id='fat-menu']")
    private WebElement mbutton;
    public Mainpage clicbtn(){
        click(mbutton);
        return this;

    }
    @FindBy(xpath ="//*[contains(@class,'menu-categories__item ng-star-inserted')]")
    private WebElement cat;
    public Mainpage categ(){
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

@FindBy(xpath = "//a[contains(@href,'4627893/')][contains(@class,'js-menu-categories__link')]")
private WebElement sport;
    public Mainpage clksport(){
        click(sport);
        return this;
    }
    @FindBy(xpath = "//li[@class='lang__item lang-header__item lang-header__item_state_active ng-star-inserted']")
    private WebElement ukrBtn;
    public Mainpage checkTheLanguge(){
        try {
            click(waitUntilElementToBeClickableByXpath(String.valueOf(ukrBtn)));
        }catch(Exception e){
            click(ukrBtn);
        }
        return this;
        }

}