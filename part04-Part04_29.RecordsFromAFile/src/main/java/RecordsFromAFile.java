
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        
        ArrayList<String> listName = new ArrayList<>();
        ArrayList<Integer> listAge = new ArrayList<>();
        try (Scanner fileScanner = new Scanner(Paths.get(file))){
            
            while (fileScanner.hasNextLine()){
                
                String line = fileScanner.nextLine();
                
                String[] parts = line.split(",");
                String name = parts[0];
                int age = Integer.valueOf(parts[1]);
                
                listName.add(name);
                listAge.add(age);               
            }
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        
        for (int i = 0; i<listName.size();i++){
            System.out.println(listName.get(i)+", age: "+listAge.get(i)+" years");
        }

    }
}
