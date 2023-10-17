package ilia.gymBeam.page;

import driver.DriverPoll;
import ilia.gymBeam.supplements.sportsSupplements;
import pages.BasePage;

public class Page extends BasePage {
    public sportsSupplements sport()
    {
        DriverPoll.getDriver().get("https://gymbeam.ua/ua/?campaignid=1716176107&adgroupid=68975426084&gclid=CjwKCAjwvrOpBhBdEiwAR58-3PRB-aPfXhFPutDrE1tYFDLB4GIruftOUnnNHFwl8LLSq5_usBlbiBoC_hAQAvD_BwE");
        return new sportsSupplements();
    }

}
