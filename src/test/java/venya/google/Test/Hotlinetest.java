package venya.google.Test;

import org.testng.annotations.DataProvider;

public class Hotlinetest {
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
    }


}
