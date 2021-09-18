package SimplilearnProjectFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileOperationClass implements FileOperationInterface{
    boolean isExist;
    File file;
    @Override
    public void createFile(String fileName) {
        file = new File(fileName);
        try{
                if(!(file.exists())){
                    file.createNewFile();
                    System.out.println("File created successfully");
                }
                else{
                    System.out.println("File file " + fileName + " already exist");
                }
            }
        catch(IOException e){
            e.printStackTrace();
        }
        }


    @Override
    public void deleteFile(String fileName) {
        file = new File(fileName);
        try{
            if((file.exists())){
                file.delete();
                System.out.println("File "+fileName+ " deleted successfully");
            }
            else{
                System.out.println("File name "+fileName+" does not exist, please try again");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void displayFile() {

    }

    @Override
    public String search(String directory, String fileName) {
        List<String> files = new ArrayList<String>();
        file = new File(directory);
        for(File file : file.listFiles()){
            if(file.getName().endsWith(".txt")){
                files.add(file.getName());
            }
        }
        if(files.toString().contains(fileName)){
            return "File name " + fileName + " exist";
        }
        else {
            return "File name " + fileName + " does not exit";
        }
    }

    @Override
    public List<String> displayFIles(String directory) {
        List<String> files = new ArrayList<String>();
        file = new File(directory);
        for(File file : file.listFiles()){
            if(file.getName().endsWith(".txt")){
                files.add(file.getName());
            }
        }
        return files;
    }
}

