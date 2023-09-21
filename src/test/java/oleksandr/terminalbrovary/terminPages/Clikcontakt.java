package oleksandr.terminalbrovary.terminPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

public class Clikcontakt extends BasePage {
@FindBy(xpath = "//*[text()='50.527280, 30.795101']")
    private WebElement nobertext;
public Clikcontakt coordmaps(){
    String clousemapa = nobertext.getText().replaceAll("[^0-9]","");
    int mapasho = Integer.parseInt(clousemapa);
    System.out.println(mapasho);
    return this;
}

}
