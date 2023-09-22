package venya.google.Page;

import driver.DriverPoll;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import venya.google.Test.Hotlinetest;

import java.util.List;

public class Hotlinepage {
    @DataProvider(name = "testData")
    public static Object[][] testData() {
        return new Object[][]{
                {"https://rozetka.com.ua/ua/", "ExpectedResult1"},
                {"https://www.google.com.ua/", "ExpectedResult2"},
                {"https://hotline.ua/", "ExpectedResult3"}
                // Додавайте інші набори даних тут
        };
    }

    @DataProvider(name = "test2")
    public Object[][] test2() {
        return new Object[][]{
                {"HOTLINE.FINANCE"},
                {"Енергозабезпечення"},
                {"Авто і Мото"},
                {"Побутова техніка"},
                {"Все для дому"},
                {"Дача, сад"},
                {"Дитячі товари"},
                {"Зоотовари"},
                {"Інструменти"},
                {"Комп'ютери, Мережі"},
                {"Краса і здоров'я"},
                {"Музичні інструменти"},
                {"Сантехніка, Будматеріали"},
                {"Смартфони, Телефони"},
                {"Спорт, Активний відпочинок"},
                {"ТБ, Аудіо, Відео, Фото"},
                {"Товари для дорослих"},
                {"Товари для геймерів"},
                {"Туризм, Риболовля"},
                {"Годинники, Сумки, Аксесуари"}

        };


    }

    @DataProvider(name = "test3")
    public Object[][] test3() {
        return new Object[][]{
                {"Енергозабезпечення"},
                {"Авто і Мото"},
                {"Побутова техніка"},
                {"Все для дому"}

        };

    }

    @DataProvider(name = "test4")
    public Object[][] test4() {
        return new Object[][]{
                {"Дача, сад"},
                {"Дитячі товари"},
                {"Зоотовари"},
                {"Інструменти"},
                {"Комп'ютери, Мережі"}
        };

    }

    @DataProvider(name = "test5")
    public Object[][] test5() {
        return new Object[][]{
                {"Краса і здоров'я"},
                {"Музичні інструменти"},
                {"Сантехніка, Будматеріали"},
                {"Смартфони, Телефони"}

        };

    }

    @DataProvider(name = "test6")
    public Object[][] test6() {
        return new Object[][]{
                {"Ноутбуки"},
                {"Комп'ютери, неттопи, моноблоки"},
                {"Монітори"},
                {"Gaming"},
        };

    }

    @DataProvider(name = "test7")
    public Object[][] test7() {
        return new Object[][]{
                {"Велосипеди та аксесуари"},
                {"Електротранспорт"},
                {"Тренажери"},
                {"Фітнес та аеробіка"},
        };

    }

    @DataProvider(name = "test8")
    public Object[][] test8() {
        return new Object[][]{
                {"Смартфони Apple"},
                {"Смартфони Samsung"},
                {"Смартфони Xiaomi"},
                {"Смартфони Poco"},

        };
    }

    @DataProvider(name = "test9")
    public Object[][] test9() {
        return new Object[][]{
                {"Міцні напої"},
                {"Вино"},
                {"Тютюнові вироби"},
                {"Безалкогольні напої"},
        };

    }

    @DataProvider(name = "test10")
    public Object[][] test10() {
        return new Object[][]{
                {"Корм для тварин"},
                {"Вітаміни та ласощі для тварин"},
                {"Засоби проти бліх та кліщів"},
                {"Акваріуми"},
                {"Спальні місця та переноски"},
                {"Посуд для тварин"},
                {"Іграшки для тварин"},
                {"Наповнювачі для туалетів"},

        };

    }
}
//    public Hotlinepage hotlinemouse() {
//        DriverPoll.getDriver().get("https://hotline.ua");
//        sleep(2);
//        return this;
//    }
//
//    @FindBy(xpath = "//div[@class ='header-nav__item header-nav__item--has-children d-mobile d-desktop']")
//    private List<WebElement> company;
//
//    public void hoverElement(int index) {
//        Actions actions = new Actions(DriverPoll.getDriver());
//
//        if (index >= 0  index < company.size());
//        WebElement elementToHover = company.get(index);
//        actions.moveToElement(elementToHover).perform();
//    }
//
//
//    @FindBy(xpath ="//div[@class='header-nav__item header-nav__item--current header-nav__item--is-child d-mobile d-desktop']")
//    private List<WebElement> careers;
//
//    public Hotlinepage testcareers(){
//
//
//
//
//    }
//
//
//}







