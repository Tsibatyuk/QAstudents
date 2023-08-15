package maksim;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class Test1 {
    public int result = 50;

    public static void main(String[] args) {
        System.out.println("Hello world");
    }

    @Test
    public void d() {
        int result = summ(50, 50);
        System.out.println(result);
    }

    public int summ(int first, int second) {
        return first + second;
    }
    double age = 10;
    boolean v = true;
    @Test
    public void ts() {
        age = 20.5;
        System.out.println(age);
        System.out.println(10>5);
    }@Test
public void da() {
//       String name = "gosha";
//       for (int itarator = 0;itarator < name.length();itarator ++){
//       System.out.println(name.charAt(itarator));}
////
//        public void ee(){
//     int [] num = {2,3,4,5,8,2,6,5,4};
//        for (int elements : num) {
//            System.out.println(elements);}
        int[] far = {2, 3, 567453, 8735, 88, 6548, 6578, 56, 5};
        int gas[] = {31653265, 3, 65, 62, 456, 45, 654, 64, 6, 4};

        System.out.println(far[4]);

        int tyt[] = new int[20];

        System.out.println(tyt[5]);
    }
@Test
   public void yuy(){
        String hg = "maksim";
       System.out.println(hg.length());

       System.out.println(hg.substring(0,3));
    System.out.println(hg.substring(hg.length()-1));
    System.out.println(hg.contains("is"));
   }
@Test
public void ror(){
        String gog = "my name maksim";
        String hoh = " roror";
        int age = 41;
        double bob = 22;
    System.out.println( gog + hoh + (age + bob));
}@Test
public void kok(){
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.get("https://chat.openai.com/?model=text-davinci-002-render-sha");

}@Test
public void tot(){
        String fot="tersythtgdfre dfgzfgdf vbgdbzf";

   String[]g= (fot.split(" "));
        System.out.println(g[1]);
}


}