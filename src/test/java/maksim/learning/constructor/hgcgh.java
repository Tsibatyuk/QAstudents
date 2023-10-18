package maksim.learning.constructor;

import maksim.webtesting.tenSites.page.LambdaInterface;
import org.testng.annotations.Test;

import java.util.*;
import java.util.stream.Collectors;
@Test
public class hgcgh {

    public void gamers() {
        List<Player> players = new ArrayList<Player>();
        players.add(new Player(1, "John", 30));
        players.add(new Player(2, "James", 120));
        players.add(new Player(3, "Jane", 10));
        players.add(new Player(3, "Jane", 10));
        players.add(new Player(4, "Jozeph", 50));

        List<Object>gameList = players.stream().map(Player::getName).distinct().sorted().collect(Collectors.toList());
        System.out.println(gameList);
    }

    }




