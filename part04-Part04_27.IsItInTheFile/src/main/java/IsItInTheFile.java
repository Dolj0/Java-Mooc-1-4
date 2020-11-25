
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int found = 0;
        int findable = 0;

        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        
        ArrayList<String> list = new ArrayList<>();
        try (Scanner fileScanner = new Scanner(Paths.get(file))){
            while (fileScanner.hasNextLine()){
                list.add(fileScanner.nextLine());
            }
        } catch (Exception e){
            findable = 1;
        }

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        
        for (int i=0;i<list.size();i++){
            if (list.get(i).equals(searchedFor)){
                found = 1;
            }
        }    
        
        if (findable==0){
            
            if (found == 1){
                System.out.println("Found!");
            } else {
                System.out.println("Not found.");
            }
        } else {
            System.out.println("Reading the file "+file+"failed.");
        }    
    }
}
