import java.io.BufferedReader;
import java.io.FileReader;

public class PersonOutputStream {

    private String fileName;
    
    public PersonOutputStream(String fileName) {
        this.fileName = fileName;
    }

    public void readFileContent() {
        String line = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (Exception e) {
            System.err.println(e);
        }
    }

}
