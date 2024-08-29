public class Cyclist {

    private String name;
    private String team;

    public Cyclist(String name, String team) {
        this.name = name;
        this.team = team;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cyclist: " + name + "\n");
        sb.append("Team: " + team + "\n");
        return sb.toString();
    }

    public String getName() {
        return name;
    }

    public String getTeam() {
        return team;
    }
}
