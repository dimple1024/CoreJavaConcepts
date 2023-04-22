package java_generics;

public class JavaGenerics {
    public static void main(String[] args) {
        FootballPlayer p1 = new FootballPlayer("Dimple", 25);
        FootballPlayer p2 = new FootballPlayer("Piyush", 23);
        Team<FootballPlayer> team1 = new Team<>();
        team1.addPlayer(p1);
        team1.addPlayer(p2);
        team1.setRanking(1);
        Team<CricketPlayer> team2 = new Team<>();
        team2.addPlayer(new CricketPlayer("abc", 26));
        team2.addPlayer(new CricketPlayer("xyz", 26));
        team2.setRanking(2);
        League<Team<CricketPlayer>> league = new League<>();
        league.addTeam(team2);
    }
}
