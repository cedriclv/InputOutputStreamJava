import java.io.FileOutputStream;


public class PersonInputStream {

    private String fileName;

    public PersonInputStream(String fileName) {
        this.fileName = fileName;
    }

    public void addPersonToFile(String contentToWrite) {
        byte[] bytesToWrite = contentToWrite.getBytes();
        try {
            FileOutputStream fos = new FileOutputStream(fileName, true);
            String newLine = "\n";
            fos.write(newLine.getBytes());
            for (byte b : bytesToWrite) {
                fos.write(b);
            }
            fos.close();
        } catch (Exception e) {
            System.err.println(e);
        }
    }

}
