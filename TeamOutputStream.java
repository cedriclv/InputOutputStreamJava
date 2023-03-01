import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class TeamOutputStream {
    
    private String fileName;

    public TeamOutputStream(String fileName) {
        this.fileName = fileName;
    }

    public void addTeamToFile(ArrayList<Person> personsToInput) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileName, true);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            for (Person person : personsToInput) {
                objectOutputStream.writeObject(person);
            }
            objectOutputStream.close();
        } catch (Exception e) {
            System.err.println(e);
        }

    }
    

}