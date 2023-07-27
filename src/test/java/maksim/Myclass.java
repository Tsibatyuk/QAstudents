package maksim;

import abstractpages.BaseTest;
import org.asynchttpclient.netty.ws.NettyWebSocket;
import org.testng.annotations.Test;
import pisun.New;


public class Myclass extends BaseTest {

    @Test
    public void someMethod() {
        openUrl("https://www.google.com/");
    }
@Test
    public void open2window() {
        New tom = new New();
        System.out.println("someText"); // Будет выводить что-то наподобие Person@7960847b

        System.out.println("Привет, мир!");

    }
    @Test
    public void ph(){
     for (int i =5 ; i <= 50; i++) {

        System.out.println(i);
    }



    }


}
