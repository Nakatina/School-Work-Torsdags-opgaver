import java.util.ArrayList;

public class Team{
//1.c, 1.d, 1.e Attributterne for classen
	private String teamName;
	private int rank;
	private ArrayList<String> playerNames;

// 1.f constructor laver jeg her.
		public Team(String teamName){
			this.teamName = teamName;
			this.playerNames = new ArrayList<>();
		}
	//1.h setRank og metoden
		public void setRank(int rank){
			this.rank = rank;
		}
//1.l addplayer metode
		public void addPlayer(String playerName){
			playerNames.add(playerName);
			}
//1.j + 1m: tostring metode
		public String toString(){
			String result = "Hold: " + teamName + " Rang: " + rank + "\nSpillere:";
			for (String name : playerNames){
				result +="\n- " + name;
			}
	return result + "\n";
	}
}