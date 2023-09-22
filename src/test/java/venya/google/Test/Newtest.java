package venya.google.Test;

import org.testng.annotations.Test;
import tests.BaseTest;
import venya.google.Page.Newpage;

import java.util.Optional;

public class Newtest extends BaseTest {
    @Test
    public void  searchh() {
        Newpage se = new Newpage();
        se.openGoo()
                .writeGoo()
                .Googlesearch()
                .opensite();

    }


    }