import java.util.ArrayList;
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

}