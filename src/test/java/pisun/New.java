package pisun;

import abstractpages.BaseTest;
import maksim.Myclass;
import org.testng.annotations.Test;

public class New extends Myclass {

    @Test
    public void chekMyWord() {
        super.openUrl("https://shift.ua/");
    }
}