package oleksandr.webtesting.rozetka.pages;
import java.util.List;
import java.util.stream.Collectors;
import org.openqa.selenium.WebElement;
import driver.DriverPoll;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasePage;

import javax.xml.xpath.XPath;
import java.security.cert.Extension;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Mainpj extends BasePage {

    public Mainpj openrozetka (){
        DriverPoll.getDriver().get("https://rozetka.com.ua");
        return this;
    }
    @FindBy(xpath = "//button[@id='fat-menu']")
    private WebElement menuBTN;

    public Mainpj klaztomenuBaton( ){
        click(menuBTN);
    return this ;
    }

public Mainpj assertUrl (){
    Assert.assertEquals(DriverPoll.getDriver().getCurrentUrl(),"https://rozetka.com.ua/ua/");
        return this;
}



        @FindBy(xpath = "//li[contains(@class,'menu-categories__item ng-star-inserted')]")
    List<WebElement>  katalog;
    public Mainpj lora (){
       List<String> killer = katalog.stream()
               .map(WebElement::getText)
               .collect(Collectors.toList());
        killer.forEach(System.out::println);


        return this;


   }
    @FindBy(xpath = "//*[text()='Спорт і захоплення']" )
    List <WebElement> sport;
   public Mainpj clickspot(){
       click(sport.get(0));


       return this;

   }
    @FindBy(xpath = "//li[@class='lang__item lang-header__item lang-header__item_state_active ng-star-inserted']")
    private WebElement ukrBtn;
    public Mainpj checkTheLanguge(){
        try {
            click(waitUntilElementToBeClickableByXpath(String.valueOf(ukrBtn)));
        }catch(Exception e){
            click(menuBTN);
        }
        return this;
    }

    @FindBy(xpath = "//a[@class=\"menu-categories__link js-menu-categories__link menu-categories__link_state_hovered\"]\n")

}