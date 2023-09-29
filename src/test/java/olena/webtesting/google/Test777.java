package olena.webtesting.google;

import org.testng.annotations.Test;
import tests.BaseTest;
@Test
public class Test777 extends BaseTest {
    public void saitHotline() {
        MainpageTest ma = new MainpageTest();
        ma.openSait()
                .figureHotlaine();

    }
   public void saitRozetka(){
       MainpageTest in = new MainpageTest();
        in.openSai()
                .figureRozetka();
    }
    public void saitTerminal(){
        MainpageTest pa = new MainpageTest();
        pa.openSa()
                .figureTerminal();
    }
}
