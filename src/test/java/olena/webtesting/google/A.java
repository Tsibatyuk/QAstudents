package olena.webtesting.google;

import driver.DriverPoll;
import org.apache.commons.io.filefilter.TrueFileFilter;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

class A {
    protected Object test() {
        return new Object();
    }
}

class B extends A {
    @Override
    public Object test() {
        return "";
    }

    //        Assert.assertEquals(DriverPoll.getDriver().getTitle(),expected);
    public boolean asdf() {
        String expected = "Welcome back,";
        if (expected == DriverPoll.getDriver().getTitle())
            return true;
        else {
            return false;
        }
    }

    public void qwert() {
        Assert.assertTrue(asdf(), "Сам Вася");

    }

}
