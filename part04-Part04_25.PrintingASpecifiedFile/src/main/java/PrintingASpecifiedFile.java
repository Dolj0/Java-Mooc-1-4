
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which file should have its contents printed?");
        String s = scanner.nextLine();
        myScanner(s);
    }
    
    public static void myScanner(String s){
        try (Scanner scanner = new Scanner(Paths.get(s))){

            while (scanner.hasNextLine()){
                String row = scanner.nextLine();
                System.out.println(row);
            }
        } catch (Exception e){
            System.out.println("Error: "+e.getMessage());

        }

    
    }
}    
