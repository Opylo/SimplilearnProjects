package SimplilearnProjectFile;

import java.util.Scanner;

public class FileApplication {
//    FileOperationClass fileOperationClass = new FileOperationClass();
    FileOperationMenuClass fileOperationMenuClass = new FileOperationMenuClass();

    int fileMenuItem;

    Scanner input = new Scanner(System.in);
    public void fileApplication(){
        System.out.println("***************");
        System.out.println("Select 1 perform file operations \n" +
                "Select 0 to exit Application");
        System.out.println("***************");

        while (true){
            System.out.println("Enter Menu: ");
            fileMenuItem = input.nextInt();
            input.nextLine();

             if(fileMenuItem == 1){
                System.out.println("Display file operation menu");
                fileOperationMenuClass.fileApplication();
            }
            else if(fileMenuItem == 0){
                System.out.println("Application terminate successfully");
                System.exit(-1);
            }
            else {
                System.out.println("You have entered invalid menu item, please try again");
            }
        }
    }
}
