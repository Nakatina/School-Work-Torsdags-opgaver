public class Room {

    private int numberOfLamps;
    private int numberOfWindows;

    //3.b constructor.

    public Room(int numberOfLamps, int numberOfWindows){
        this.numberOfLamps = numberOfLamps;
        this.numberOfWindows = numberOfWindows;
    }
    //her henter vi getters
        public int getNumberOfLamps(){
        return numberOfLamps;
    }
        public int getNumberOfWindows() {
        return numberOfWindows;
    }
    //her laver vi setters
    public void setNumberOfLamps(int numberOfLamps){
        this.numberOfLamps = numberOfLamps;
    }

    public void setNumberOfWindows(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
    }
}
