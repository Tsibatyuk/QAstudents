package venya.google.Test;

import org.testng.annotations.Test;
import tests.BaseTest;
import venya.google.Page.OptimovePage;

public class OptimoveTest extends BaseTest {
    @Test

    public void Optimove(){
        OptimovePage opti = new OptimovePage();
        opti.openOptimove();
        opti.hoverElement(0);
        opti.testcareers();
        opti.select();

    }
}
