import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.*;

public class TeamInputStream {

    private String fileName;

    public TeamInputStream(String fileName) {
        this.fileName = fileName;
    }

    public ArrayList<Person> getTeamFromFile() {
        ArrayList<Person> personsRetrieved = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(fileName);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Person personRetrieved;
            while((personRetrieved = (Person) objectInputStream.readObject()) != null){
                personsRetrieved.add(personRetrieved);
            }
            objectInputStream.close();
        } catch (Exception e) {
            System.err.println(e);
        }
        return personsRetrieved;
    }
}
