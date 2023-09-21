package ilia.Tasks;

import driver.DriverPoll;
import org.apache.logging.log4j.core.appender.rolling.action.IfAccumulatedFileCount;
import org.openqa.selenium.devtools.v114.tethering.model.Accepted;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import javax.swing.border.TitledBorder;
import java.awt.*;

public class Task2 {

    public boolean dd(){
        String expected = "Welcome back";
        if (DriverPoll.getDriver().getTitle().equals(expected))
        {
            return true;
        }
        else
        {
            return false;
        }

    }
    public void aa()
    {
        Assert.assertTrue(dd());
    }
}
