import java.util.*;

public class TeamInputStream {

    private String fileName;

    public TeamInputStream(String fileName) {
        this.fileName = fileName;
    }

    public void addTeamToFile(ArrayList<String> teamToInput) {
        PersonInputStream personInputStream = new PersonInputStream(fileName);
        for (String teamMember : teamToInput) {
            personInputStream.addPersonToFile(teamMember);
        }
    }
}
