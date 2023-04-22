package java_generics;

import java.util.List;

public class League <T extends Team>{
    private List<T> leagueTeams;
    public void addTeam(T team) {
        this.leagueTeams.add(team);
    }
}
