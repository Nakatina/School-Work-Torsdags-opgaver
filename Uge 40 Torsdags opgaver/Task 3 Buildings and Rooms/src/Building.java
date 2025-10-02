import java.util.List;

public class Building {
    private List<Room> rooms;
    private int numberOfFloors;
    //3.e constructor
    public Building(List<Room> rooms, int numberOfFloors){
        this.rooms = rooms;
        this.numberOfFloors = numberOfFloors;
    }
//laver getter og setter. 3f
    public List<Room> getRooms() {
        return rooms;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }
}
