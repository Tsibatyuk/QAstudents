package oleksandr.webtesting.hotline.testHo;

import driver.DriverPoll;
import oleksandr.webtesting.hotline.hotlinePages.HotlinePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import tests.BaseTest;

import java.util.List;

public class Testing extends BaseTest {
    @FindBy(xpath = "//li[@class='menu-main__item']")
    List<WebElement> elements;

    @Test(dataProvider = "testData")
    public void testhotline(String t){
        HotlinePage next = new HotlinePage();
        next.openHotline()
                .clickUA();
        String xpathText = String.format("//*[contains(text(),'%s')]", t);
       DriverPoll.getDriver().findElements(By.xpath(xpathText)).get(0).click();
        sleep(2);
    }
    @DataProvider(name = "testData")
    public String[][] masiv26() {
        String[][] text26 = new String[elements.size()][0];
        for (int i = 0; i < elements.size(); i++) {
            WebElement element = elements.get(i);
            String text = element.getText().replaceAll("\\s", "");
            text26[1][0] = text;
        }
        return text26;
    }

    @Test
    public void asdfg(){
        String name = "жопочес";
        int age =25;
        String alex = String.format("У макса %s.Глистов %d шт",name,age);
        System.out.println(alex);
    }
}
