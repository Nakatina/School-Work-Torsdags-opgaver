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
		String userChoice = gameMenu.promptUser();
		int actionNumber = Integer.parseInt(userChoice);
		doAction(actionNumber);
	}
		//har taget den nedre kode ud af spil da jeg skal lave en do action Metode
		//gameMenu.displayMenu();
	public static void doAction(int action){
		switch (action){
			case 1:
				System.out.println("Starting the Game now!");
				break;
			case 2:
				System.out.println("Fetching previously saved game data");
				break;
			case 3:
				System.out.println("Game Paused");
				break;
			case 4:
				System.out.println("Ending Game");
				break;
			default:
				System.out.println("Invallid vhoice. Please enter a number between 1 and 4");
			}
	
	
	
	}

}