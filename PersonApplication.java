import java.util.ArrayList;

public class PersonApplication {
    public static void main(String[] args) {

        ArrayList<String> persons = new ArrayList<>();

        Person toto = new Person("batman");
        Person titi = new Person("robin");
        Person cedric = new Person("cedric");

        persons.add(toto.getName());
        persons.add(titi.getName());
        persons.add(cedric.getName());

        // specify the file
        String fileName = "persons.txt";

        // call method to input data
        TeamInputStream teamInputStream = new TeamInputStream(fileName);
        teamInputStream.addTeamToFile(persons);

        // call method to read data
        TeamOutputStream teamOutputStream = new TeamOutputStream(fileName);
        teamOutputStream.readTeamFromFile();
    }
}
