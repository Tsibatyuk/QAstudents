package maksim.webtesting.rozetka.test;

import maksim.webtesting.rozetka.pages.Mainpage;
import org.testng.annotations.Test;
import tests.BaseTest;

public class Rozetka extends BaseTest {
    @Test
    public void lanquagetest() {
        Mainpage mp = new Mainpage();
        mp.openrozetka()
                .asserturl()
                .clicCategorii()
                .listrrr();
        sleep(3);
    }

    @Test
    public void frog() {
        Mainpage forest = new Mainpage();
        forest.openrozetka()
                .checkTheLanguge()
                .clicCategorii()
                .clksport();
        sleep(4);

    }

    @Test
    public void login() {
        Mainpage zr = new Mainpage();
        zr.openrozetka()
                .log()
                .emptyfield()
                .reestr()
                .notbot();
        sleep(4);
    }
    @Test
    public void listWebElements(){
        Mainpage lst = new Mainpage();
        lst.openrozetka()
                .webElement();
    }

    @Test
    public void screachHP(){
        Mainpage hp = new Mainpage();
        hp.openrozetka()
                .clicCategorii()
                .clcNotebook()
                .clcscreach();

        sleep(5);
    }
}
