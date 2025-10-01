import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {
    private ArrayList<String> coffeeMenu = new ArrayList<>();
//Get metode
    public ArrayList<String> getCoffeeMenu(){
        return coffeeMenu;
    }

public void loadMenuData(){
        try{
            File file = new File("data/coffees.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                coffeeMenu.add(line); //Her kommer Kaffen! håber du er tørstig!


            }
            scanner.close();
        } catch (FileNotFoundException e){
            System.out.println("Filen er ikke fundet check plasering for filen");
        }
}

}
