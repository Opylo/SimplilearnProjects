package SimplilearnProjectFile;

import java.util.Scanner;

public class FileOperationMenuClass {

    Scanner input = new Scanner(System.in);
    FileOperationClass fileOperationClass = new FileOperationClass();
    String path;
    int fileOperationMenuItem;
    String fileCreationName;
    String fileSearchName;

    public void fileApplication(){
        System.out.println("***************");
        System.out.println("\nSelect 1 to create file \n" +
                "Select 2 to delete file \n" +
                "Select 3 search files \n" +
                "Select 4 to display file\n" +
                "Select 5 to go back to previous menu \n" +
                "Select 0 to exit application");
        System.out.println("***************");

        while (true){
            System.out.println("Enter File Operation Menu: ");
            fileOperationMenuItem = input.nextInt();
            input.nextLine();
            if (fileOperationMenuItem == 1){
                System.out.println("Enter file name with .txt extension example: filename.txt");
                fileCreationName = input.nextLine();
                fileOperationClass.createFile(fileCreationName);
            }
            else if(fileOperationMenuItem == 2){
                System.out.println("Enter file name with .txt extension you want to delete example: filename.txt");
                fileCreationName = input.nextLine();
                fileOperationClass.deleteFile(fileCreationName);
            }
            else if(fileOperationMenuItem == 3){
                FileOperationMenuClass fileOperationMenuClass = new FileOperationMenuClass();
                System.out.println("Please specify files path. example root/child/...");
                path = input.nextLine();
                System.out.println("Please specify files name to search example filename.txt");
                fileSearchName = input.nextLine();
                System.out.println(fileOperationMenuClass.fileOperationClass.search(path,fileSearchName));
            }
            else if(fileOperationMenuItem == 4){
                FileOperationMenuClass fileOperationMenuClass = new FileOperationMenuClass();
                System.out.println("Pleas specify files path. example root/child/...");
                path = input.nextLine();
                System.out.println(fileOperationMenuClass.fileOperationClass.displayFIles(path));
            }
            else if(fileOperationMenuItem == 5){
                FileApplication fileApplication = new FileApplication();
                fileApplication.fileApplication();
            }
            else if(fileOperationMenuItem == 0){
                System.out.println("Application terminated successfully!");
                System.exit(-1);
            }
            else {
                System.out.println("You have entered invalid menu item, please try again");
            }
        }
    }
}
