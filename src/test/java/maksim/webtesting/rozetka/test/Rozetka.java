package maksim.webtesting.rozetka.test;

import maksim.webtesting.rozetka.pages.Mainpage;
import org.testng.annotations.Test;
import tests.BaseTest;

public class Rozetka extends BaseTest {
    @Test
public void lanquagetest(){
    Mainpage mp = new Mainpage();
    mp.openrozetka()
            .asserturl();
        System.out.println("Мова UA");



}
}
