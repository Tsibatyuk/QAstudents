package venya.google.Test;

import org.testng.annotations.Test;
import tests.BaseTest;
import venya.google.Page.Googlepage;
import venya.google.Page.Weather;

public class Weathertest extends BaseTest {

    @Test
    public void weatherr(){
        Weather wea = new Weather();
        wea.Goopen()
                .Goowrite()
                .entersearchGoogle()
                .weathercheckout();

    }





}
