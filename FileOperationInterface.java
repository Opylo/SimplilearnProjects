package SimplilearnProjectFile;

import java.util.List;

public interface FileOperationInterface {
    public void createFile(String fileName);
    public void deleteFile(String fileName);
    public String search(String directory, String fileName);
    List<String> displayFIles(String directory);
    public void displayFile();
}
