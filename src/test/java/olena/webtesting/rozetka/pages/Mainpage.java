package olena.webtesting.rozetka.pages;

import driver.DriverPoll;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasePage;

import javax.swing.*;
import java.security.cert.Extension;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Mainpage extends BasePage {
    public Mainpage openUrl(String siteUrl) {
        DriverPoll.getDriver().get(siteUrl);
        return this;


    }
    @FindBy(xpath = "//button[contains(@id,'fat-menu')]")
    private WebElement fatMenuBtn;
    public Mainpage cliktomenubutton(){
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
    public Mainpage clikcomputer(){
        click(computer);

        return new Mainpage();
    }

 @FindBy(xpath = "//ul[@class='menu-categories ng-star-inserted']/li/a")
 public List<WebElement> cycle;


 public Mainpage clickCycleForDirectoryXpath(int y){
        click(cycle.get(y));
        return this;
 }
 public void clickCycle(int y){
     click(cycle.get(y));
 }

    public Mainpage textCycleForDirectoryXpath(int i, List<String> u){
        u.add(cycle.get(i).getText());
        return this;
    }
    List<String> cycle2 = new ArrayList<>();



    public  void forCycle(){
        int nam = cycle.size();
        for (int i = 0; i<nam;i++){
            textCycleForDirectoryXpath(i,cycle2);
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
    public Mainpage clikMenu(){
        click(menu);
        sleep(4);
        return this;
    }
@FindBy(xpath = "//img[contains(@alt,'Ноутбуки')]")
    private WebElement clikLaptop;
    public Mainpage laptop(){
        click(clikLaptop);
        sleep(5);
        return this;
    }
//@FindBy(xpath = "")

}