package ilia.tenTest.test;

import ilia.tenTest.page.Page;
import org.testng.annotations.Test;
import tests.BaseTest;

public class TestMegogo extends BaseTest {
    @Test
    public void megogoTest()
    {
        Page p = new Page();
        p.openMegogo()
                .test1()
                .test2()
                .test3()
                .test4()
                .test5()
                .test6()
                .test7()
                .test8()
                .test9()
                .test10()
                .test11()
                .test12()
                .test13()
                .test14()
                .test15()
                .test16()
                .test17()
                .test18()
                .test19()
                .test20();
    }
}
