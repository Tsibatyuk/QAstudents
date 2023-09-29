package olena.webtesting.google;

import lombok.Data;
import lombok.Getter;
import org.testng.annotations.Test;

import java.util.*;
import java.util.stream.Collectors;

@Data
public class Players {

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public Players(int id, String name, int rank) {
        this.id = id;
        this.name = name;
        this.rank = rank;
    }

    @Getter
    private int id;
    @Getter
    private String name;
    @Getter
    private int rank;

    public static void main(String[] args) {
        List<Players> playersList = new ArrayList<Players>();
        playersList.add(new Players(1, "Євген", 30));
        playersList.add(new Players(2, "Веніамін", 120));
        playersList.add(new Players(3, "Максим", 10));
        playersList.add(new Players(3, "Максим", 10));
        playersList.add(new Players(4, "Ілля", 50));


        List<Players> sortedPlayersList = playersList.stream()
                .sorted(Comparator.comparing(Players::getName))
                .collect(Collectors.toList());
        Set<String> uniqueNamesSet = new HashSet<>();
        List<Players> uniquePlayersList = new ArrayList<>();
        for (Players player : sortedPlayersList) {
            if (uniqueNamesSet.add(player.getName())) {
                uniquePlayersList.add(player);
            }
        }
        for (Players player : uniquePlayersList) {
            System.out.println(player.getName());
        }
    }

}