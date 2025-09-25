import java.util.ArrayList;
import java.util.Scanner;
//GameMenu er min entity class, som der indeholder den data (actions) og funktionalitet (displayMenu)
public class GameMenu {
	private ArrayList<String> actions;

	public GameMenu(ArrayList<String> actions){
		this.actions = actions;
		}

	public void displayMenu(){
		for (String action : actions){
			System.out.println(action);
		}
	}

	public String promptUser(){
		
		System.out.println("Skriv et nummer for at vælge");
		displayMenu();
		
		Scanner scanner = new Scanner(System.in);
		String choice = scanner.nextLine();
		return choice;
	}


}