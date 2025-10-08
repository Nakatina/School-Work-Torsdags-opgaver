import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
//laver de tre rum vi skal bruge 3.g
        Room stue = new Room(2,1);
        Room bad = new Room(5,4);
        Room soveVærelse = new Room(3,2);

        //de rooms vi har lavet skal ind i en liste
        List<Room> roomList = new ArrayList<>();
        roomList.add(stue);
        roomList.add(bad);
        roomList.add(soveVærelse);

        //så skal vi have en bygning med rummene 3.i
        Building normalBuilding = new Building(roomList, 2);

        //3.j sammen lagt tal på lamper vinduer og rum!
        System.out.println("Det totale antal af Lamper er: " + countLampsInBuilding(normalBuilding));
        System.out.println("det totale antal af Vinduer er: " + countWindowsInBuilding(normalBuilding));
        System.out.println("Det totalle antal of rum er: " + countRoomsInBuilding(normalBuilding));

        //3.k Tester isNormal()

        System.out.println("Is normal building normal? " + isNormal(normalBuilding));

        //test med en ikke normal building
        Building unormalBuilding = new Building(roomList, 10);
        System.out.println("Is abnormal building normal?" + isNormal(unormalBuilding));


        }
        //Lampe tæller
        public static int countLampsInBuilding(Building building){
        int totalLamps = 0;
        for (Room room : building.getRooms()){
            totalLamps += room.getNumberOfLamps();
        }
        return totalLamps;
        }
        //vindu tæller (Havde en fejl i vindue tæller da jeg bare kopierede Lampe tæller. Fandt fejlen og rettede.)

        public static int countWindowsInBuilding(Building building){
        int totalWindows = 0;
        for (Room room : building.getRooms()){
            totalWindows += room.getNumberOfWindows();
        }
        return totalWindows;
    }
    //Rum tæller!
        public static int countRoomsInBuilding(Building building){
        return building.getRooms().size();
    }
    public static boolean isNormal(Building building){
        return building.getNumberOfFloors() <= building.getRooms().size();


    }
}