package venya.google.Page;

import driver.DriverPoll;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
    public class Weather extends BasePage {
        public Weather Goopen() {
            DriverPoll.getDriver().get("https://www.google.com.ua/");
            sleep(5);
            return this;
        }

        @FindBy(xpath = "//textarea[@class='gLFyf']")
        private WebElement writeGoogle;

        public Weather Goowrite() {
            setValue(writeGoogle, "Погода");
            sleep(3);
            setValue(writeGoogle, Keys.ESCAPE.toString());
            sleep(3);
            return this;
        }

        @FindBy(xpath = "//div[@class='FPdoLc lJ9FBc']//input[@class='gNO89b']")
        private WebElement enterGo;

        public Weather entersearchGoogle() {
            click(enterGo);
            sleep(3);
            return this;
        }

        @FindBy(xpath = "//span[@id='wob_tm']")
        private WebElement weather;

        public Weather weathercheckout() {
            String temperatureText = weather.getText().replaceAll("\\D+", ""); // Видаляємо всі нецифрові символи
            int temperature = Integer.parseInt(temperatureText);


            if (temperature < 15) {
                System.out.println("холодно.");
            } else if (temperature > 30) {
                System.out.println(" жарко.");
            } else {
                System.out.println("Погода - самий раз.");
            }
            return this;

        }

    }






