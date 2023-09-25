package zhenia.justlessons;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProv {

    @DataProvider(name = "dp")
    public Object[][] createData(Method m) {
        return new Object[][] { new Object[] { "лфлф" }, {"73465876"}};
    }

    @Test(dataProvider = "dp")
    public void test1(String s) {
        System.out.println(s);
    }
//
//    @Test(dataProvider = "dp")
//    public void test2(String s) {
//    }
//    @Test(dataProvider = "dp")
//    public void zhopa(String s){
//    }


}
