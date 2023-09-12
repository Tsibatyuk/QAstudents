package olena.webtesting.hotline.pages2;

import org.testng.annotations.DataProvider;

public class DataPro {
    @DataProvider(name = "testData")
    public Object[][] testData() {
        return new Object[][]{
                {"https://rozetka.com.ua/ua/", "ExpectedResult1"},
                {"https://www.google.com.ua/", "ExpectedResult2"},
                {"https://hotline.ua/", "ExpectedResult3"}
                // Додавайте інші набори даних тут
        };

    }

    @DataProvider(name = "test")
    public Object[][] test() {
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
                {"Годинники, Сумки, Аксесуари"},
        };
    }
}
