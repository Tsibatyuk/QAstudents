package venya.google.Test;

import org.testng.annotations.Test;
import venya.google.Page.Googlepage;

public class Googletest {
    @Test
    public void search(){
        Googlepage sea = new Googlepage();
        sea.openGo();

    }
}
