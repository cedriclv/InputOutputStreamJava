import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class PersonOutputStream {

    private String fileName;
    
    public PersonOutputStream(String fileName) {
        this.fileName = fileName;
    }

    public void addPersonToFile(Person person){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileName, true);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(person);
            objectOutputStream.close();
        } catch (Exception e) {
            System.err.println(e);
        }
    }

}
