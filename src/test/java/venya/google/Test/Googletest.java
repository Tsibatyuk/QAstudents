package venya.google.Test;

import org.testng.annotations.Test;
import tests.BaseTest;
import venya.google.Page.Googlepage;

public class Googletest extends BaseTest {
    @Test
    public void searchh() {
        Googlepage sea = new Googlepage();
        sea.openGo()
                .writeinGo()
                .entersearchGo()
                .Googlesite()
                .videos()
                .nextbutton()
                .previouspage();

    }

    @Test
    public void weatherrr(){
        Googlepage  sea = new Googlepage();
        sea.openGo()
                .entersearchGo()
                .Googlesite();

    }
}

