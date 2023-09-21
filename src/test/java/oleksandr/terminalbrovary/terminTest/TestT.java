package oleksandr.terminalbrovary.terminTest;

import oleksandr.terminalbrovary.terminPages.Clikcontakt;
import oleksandr.terminalbrovary.terminPages.Terminator;
import org.testng.annotations.Test;
import tests.BaseTest;

public class TestT extends BaseTest {
    @Test
    public void openterminal(){
        Terminator opt = new Terminator();
        opt.openurly()
                .clikcontakts();
              //  .coordmaps();





    }
}
