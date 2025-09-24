
public class Main {
	public static void main(String[] args){
	//1.g Laver en ny team instance
	Team team1 = new Team ("Datamatiker S class");
	team1.setRank(3);
	team1.addPlayer("Sebastian");
	team1.addPlayer("Sarah");
	team1.addPlayer("Luke");

	System.out.println(team1); //Bliver der ikke kaldt: toString() automatisk?
	
	Team team2 = new Team("Wow Team");
	team2.setRank(5);
	team2.addPlayer("Aalun");
	team2.addPlayer("Sharwolf");

	Team team3 = new Team("The Grinders");
	team3.setRank(1);
	team3.addPlayer("DarkZigi");
	team3.addPlayer("Bork");
	
	Team team4 = new Team("The Artists");
	team4.setRank(2);
	team4.addPlayer("Flea");
	team4.addPlayer("Shimmershell");

	Team team5 = new Team("The Wigglers");
	team5.setRank(4);
	team5.addPlayer("Ren");
	team5.addPlayer("Naka");
	
	Team team6 = new Team("The Pokefan");
	team6.setRank(6);
	team6.addPlayer("Charlz");
	team6.addPlayer("Kimba");

	System.out.println(team2);
	System.out.println(team3);
	System.out.println(team4);
	System.out.println(team5);
	System.out.println(team6);
	}

}
//adendum: Har lavet og bygget alle seks hold op med teams og sat Spillere ind. Skulle meget gerne printe det ud.