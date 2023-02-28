public class TeamOutputStream {
    
    private String fileName;

    public TeamOutputStream(String fileName) {
        this.fileName = fileName;
    }

    public void readTeamFromFile() {
        PersonOutputStream personOutputStream = new PersonOutputStream(fileName);
        personOutputStream.readFileContent();
    }

    

}