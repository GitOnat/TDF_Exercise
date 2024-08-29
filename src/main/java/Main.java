import java.io.FileNotFoundException;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Statistics statistics = new Statistics("src/main/resources/tdffinishers2024.csv");
        System.out.println(statistics.getTeams());

        System.out.println(statistics.getTeamsWithMembers());

        Map<String, String> m = new TreeMap(statistics.getTeamsWithMembers());


        System.out.println(m);

        System.out.println(statistics.getTeamMembers("lidl-trek"));


    }
}
