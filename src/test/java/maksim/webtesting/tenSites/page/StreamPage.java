package maksim.webtesting.tenSites.page;

import driver.DriverPoll;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamPage extends BasePage {
    public StreamPage openPlanetaKino() {
        DriverPoll.getDriver().get("https://planetakino.ua/");
        return this;
    }

    @FindBy(xpath = "//div[@class='movie-block']")
    private List<WebElement> films;

    public StreamPage movies() {
        List<String> spisokFilms = films.stream().map(WebElement::getText).sorted().collect(Collectors.toList());
        System.out.println(spisokFilms);
        return this;
    }

    @FindBy(xpath = "//a[@class='h-m__item-link'][text()='Розклад']")
    private WebElement schedule;

    public StreamPage clicRozdil() {
        click(schedule);
        return this;
    }

    @FindBy(xpath = "//a[@class='movie-name link-text mb-15']")
    private List<WebElement> moviesList;

    public StreamPage listfilms() {
        List<String> movie = moviesList.stream().map(WebElement::getText).map(s -> s.replaceAll("[^а-іїяАІЇ-Я]", " "))
                .sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        System.out.println(movie);
        return this;
    }

    @FindBy(xpath = "//a[@class='h-m__item-link'][text()='4DX']")
    private WebElement dx;

    public StreamPage enterDx() {
        click(dx);
        return this;
    }

    @FindBy(xpath = "//div[@class='parallax_text']")
    private List<WebElement> text;

    public StreamPage DxFilms() {
        String text1 = text.stream().map(WebElement::getText).sorted(Comparator.naturalOrder()).collect(Collectors.toList()).toString();
        System.out.println(text1);
        return this;
    }

    @FindBy(xpath = "//a[@class='h-m__item-link d-toggle']")
    private WebElement other;

    public StreamPage clicOther() {
        click(other);
        return this;
    }

    @FindBy(xpath = "//li[@class='addon-menu__list-item']")
    private List<WebElement> otherList;

    public StreamPage otherMethod() {
        List<String> otherList1 = otherList.stream().map(WebElement::getText).collect(Collectors.toList());
        otherList1.forEach(System.out::println);
        return this;
    }
    @FindBy(xpath = "//a[@class='h-m__item-link'][text()='Контакти']")
    private WebElement contact;
    public StreamPage clicContacts(){
        click(contact);
        return this;
    }
    @FindBy(xpath = "//div[@class='ct-page__info-el ct-page__info-el_center'][4]")
    private List<WebElement> info;
    public StreamPage infoMethod(){

       List<String> infoList = info.stream().map(WebElement::getText).collect(Collectors.toList());
       infoList.forEach(System.out::println);
        return this;
    }
    public StreamPage informMax(){
        Optional<String> infolist1 = info.stream().map(WebElement::getText).findFirst().stream().max(Comparator.reverseOrder());
        System.out.println(infolist1);
        return this;
    }


}
