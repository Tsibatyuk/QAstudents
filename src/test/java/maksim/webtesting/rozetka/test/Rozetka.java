package maksim.webtesting.rozetka.test;

import abstractpages.BaseTest;
import maksim.webtesting.rozetka.pages.Mainpage;
import org.testng.annotations.Test;

public class Rozetka extends BaseTest {
    @Test
public void lanquagetest(){
    Mainpage mp = new Mainpage();
    mp.openrozetka()
            .asserturl();
        System.out.println("Мова UA");



}
}
