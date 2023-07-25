package maksim;

import abstractpages.BaseTest;
import org.testng.annotations.Test;

public class Myclass extends BaseTest
{

    @Test
    public void someMethod(){
       openUrl("https://www.google.com/");
    }
    public void openwindow(){}


}
