package java_generics;

import java.util.Comparator;
import java.util.List;

public class Team <T extends Player> implements Comparable<Team<T>> {
    private String name;

    private int ranking;

    private List<T> players;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<T> getPlayers() {
        return players;
    }

    public void setPlayers(List<T> players) {
        this.players = players;
    }

    public void addPlayer(T player) {
        players.add(player);
    }

    @Override
    public int compareTo(Team<T> o) {
        if (this.ranking > o.ranking) {
            return -1;
        } else if (this.ranking < o.ranking) {
         return 1;
        }
        return 0;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }
}
