import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;

public class TestFile {
    public static void main(String[] args) {
        File inputsFile = new File("inputs.txt");

        if (inputsFile.exists()){
            System.out.println("File exist !");
            long sizeOfFile = inputsFile.length();
            System.out.println("the file size is "+ sizeOfFile);
        } else {
            System.out.println("File not found !");
        }

        //WRITING

        String contentToWrite = "Je vais a l'ecole\ndemain";
        //byte[] inputsToWrite = {'a','c','d','c'};
        byte[] inputsToWrite = contentToWrite.getBytes();

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(inputsFile);
            for (byte b : inputsToWrite) {
                fileOutputStream.write(b);
            }
            fileOutputStream.close();
        } catch (Exception e) {
            System.err.println(e);
        }

        // READING
        try {
            FileReader fileReader = new FileReader(inputsFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
            bufferedReader.close();

        } catch (Exception e) {
            System.err.println(e);
        }
                


    }

}