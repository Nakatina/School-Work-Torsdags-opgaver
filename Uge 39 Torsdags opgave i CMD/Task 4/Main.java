import java.util.ArrayList;

public class Main{ 

	public static void main(String[] args){
	//4f laver og udfylder action listen	
		ArrayList<String> actions = new ArrayList<>();
		actions.add("1) Start Game");
		actions.add("2) Resume Game");
		actions.add("3) Pause Game");
		actions.add("4) End Game");
	
//laver jeg en test print for et af elementerne
		//System.out.println(actions.get(2));
	

	//prøver at hive GameMenu frem	
	
		GameMenu gameMenu = new GameMenu(actions);

		gameMenu.displayMenu();
	
	}

}