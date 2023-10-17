package ilia.constructor1;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Players1 {
    @Test
   public void code()
   {
       List<Players> players = new ArrayList<Players>();
       players.add(new Players(1, "John", 30));
       players.add(new Players(2, "James", 120));
       players.add(new Players(3, "Jane", 10));
       players.add(new Players(3, "Jane", 10));
       players.add(new Players(4, "Jozeph", 50));

       List<Players> playerList = players.stream()
               .sorted(Comparator.comparing(Players::getName))
               .distinct()
                       .collect(Collectors.toList());
       System.out.println(playerList);
   }
}
