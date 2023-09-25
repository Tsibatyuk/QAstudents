package zhenia.playtikaZavdanya;

import java.util.*;

public class Player {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    private int id;
    private String name;
    private int rank;

    public Player(int id, String name, int rank) {
        this.id = id;
        this.name = name;
        this.rank = rank;
    }

    // Getters and setters

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return id == player.id &&
                rank == player.rank &&
                Objects.equals(name, player.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, rank);
    }

    @Override
    public String toString() {
        return "Player [id=" + id + ", name=" + name + ", rank=" + rank + "]";
    }



    public static void main(String[] args) {
        List<Player> players = new ArrayList<>();
        players.add(new Player(1, "John", 30));
        players.add(new Player(2, "James", 120));
        players.add(new Player(3, "Jane", 10));
        players.add(new Player(3, "Jane", 10));
        players.add(new Player(4, "Jozeph", 50));

        // Sort the players by name (alphabetical order)
        Collections.sort(players, Comparator.comparing(Player::getName));

        // Remove duplicates by converting to a Set and back to a List
        Set<Player> uniquePlayers = new HashSet<>(players);
        players.clear();
        players.addAll(uniquePlayers);

        // Print the result
        for (Player player : players) {
            System.out.println(player);
        }
    }
}









