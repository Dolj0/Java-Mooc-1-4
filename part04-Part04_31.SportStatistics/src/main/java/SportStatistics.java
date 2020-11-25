
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> team1 = new ArrayList<>();
        ArrayList<String> team2 = new ArrayList<>();
        ArrayList<Integer> num1 = new ArrayList<>();
        ArrayList<Integer> num2 = new ArrayList<>();
        int gamesCount = 0;
        int winCount = 0;
        int lossCount = 0;
        
        System.out.println("File:");
        String file = scan.nextLine();
        
        System.out.println("Team:");
        String whichTeam = scan.nextLine();
        
        try (Scanner scanner = new Scanner(Paths.get(file))){
            
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                
                String[] parts = line.split(",");
                team1.add(parts[0]);
                team2.add(parts[1]);
                num1.add(Integer.valueOf(parts[2]));
                num2.add(Integer.valueOf(parts[3]));
                
            } 
        }catch (Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        
       for(int i=0;i<team1.size(); i++){
           if (whichTeam.equals(team1.get(i))){
               gamesCount++;
               if (num1.get(i)>num2.get(i)){
                   winCount++;
               }else{
                   lossCount++;
               }
           }
       }
       
       for(int i=0;i<team2.size(); i++){
           if (whichTeam.equals(team2.get(i))){
               gamesCount++;
               if (num2.get(i)>num1.get(i)){
                   winCount++;
               } else {
                   lossCount++;
               }
           }
       }
       
       
        System.out.println("Games: "+gamesCount);
        System.out.println("Wins: "+winCount);
        System.out.println("Losses: "+lossCount);
    }
}


