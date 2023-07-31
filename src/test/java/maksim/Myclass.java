package maksim;

import abstractpages.BaseTest;
import org.asynchttpclient.netty.ws.NettyWebSocket;
import org.testng.annotations.Test;



public class Myclass extends BaseTest {

    @Test
    public void someMethod() {
        openUrl("https://www.google.com/");
    }

    @Test
    public void ph() {
        for (int i = 5; i <= 50; i++) {

            System.out.println(i);
        }
    }
    }

