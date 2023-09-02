package venya.google.Test;

import org.testng.annotations.Test;
import tests.BaseTest;
import venya.google.Page.Googlepage;

public class Googletest extends BaseTest {
    @Test
    public void search() {
        Googlepage sea = new Googlepage();
        sea.openGo()
                .writeinGo()
                .entersearchGo()
                .Googlesite()
                .Weatheroption();

    }
}
