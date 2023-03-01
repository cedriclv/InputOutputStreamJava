import java.util.ArrayList;

public class PersonApplication {
    public static void main(String[] args) {

        ArrayList<Person> persons = new ArrayList<>();

        Person toto = new Person("batman", 32);
        Person titi = new Person("robin", 15);
        Person cedric = new Person("cedric", 44);
        Person tata = new Person("tata", 17);

        persons.add(toto);
        persons.add(titi);
        persons.add(cedric);
        persons.add(tata);

        // specify the file
        String fileName = "persons.txt";

        // call method to write (output) data
        TeamOutputStream teamOutputStream = new TeamOutputStream(fileName);
        teamOutputStream.addTeamToFile(persons);

        // call method to get (input) data
        ArrayList<Person> personsGottenFromFile;
        
        TeamInputStream teamInputStream = new TeamInputStream(fileName);
        personsGottenFromFile =  teamInputStream.getTeamFromFile();

        // Inspect the content of the list retrieved
        for (Person person : personsGottenFromFile) {
            System.out.println("On a bien " + person.getName() + " qui a " +person.getAge() + " ans." );
        }
    }
}

// could be improved to allow append to object file...