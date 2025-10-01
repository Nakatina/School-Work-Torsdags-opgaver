import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // opretter en Cafe
        Cafe myCafe = new Cafe();
        //indlæser jeg Menu-data fra filen  eller håber på det!
        myCafe.loadMenuData();

        //henter listen med Kaffetyper
        ArrayList<String> menu = myCafe.getCoffeeMenu();
        //printer listen med kaffe! Velbekomme.
        for(String coffee : menu){
            System.out.println(coffee);
        }

    }
}