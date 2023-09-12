package maksim.webtesting.hotline.pages;

import org.testng.annotations.DataProvider;

public class DataPro {
    @DataProvider(name = "data")
    public Object [][] data(){
        return new  Object[][]{
                {"https://rozetka.com.ua/","ExpectedResult1"},
                {"https://www.linkedin.com/","ExpectedResult2"},
                {"https://hotline.ua/","ExpectedResult3"}
        };
    }
    @DataProvider(name = "testData")
    public Object[][] testData(){
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
                        { "Туризм, Риболовля"},
                        {"Годинники, Сумки, Аксесуари"}


        };
    }}

