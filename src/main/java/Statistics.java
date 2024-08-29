import java.io.FileNotFoundException;
import java.util.*;

public class Statistics {

    private List<Cyclist> cyclists;

    public Statistics(String fileName) throws FileNotFoundException {
        cyclists = new ArrayList<>(new TDFFileReader(fileName).readFile());
    }

    public Set<String> getTeams() {
        Set<String> teams = new TreeSet<>();
        for (Cyclist cyclist : cyclists) {
            teams.add(cyclist.getTeam());
        }
        return teams;
    }

    public Map<String, String> getTeamsWithMembers() {
        Map<String, String> teamsWithMembers = new TreeMap<>();

        for (Cyclist c : cyclists) {
            teamsWithMembers.put(c.getName(), c.getTeam());

        }
        return teamsWithMembers;
    }

    public String getTeamMembers(String team) {
        String returnString = "";

        for (Cyclist c : cyclists) {
            if (c.getTeam().equalsIgnoreCase(team)) {
                returnString += c.getName()+"\n";
            }
        }
        return returnString;
    }
}
