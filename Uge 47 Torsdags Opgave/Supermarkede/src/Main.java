import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;


public class Main {
    public static void main(String[] args) {
        Map<String, Vare> alle = CSVLoader.load("data/varer.csv");
        Map<String, Vare> tilbud = CSVLoader.load("data/tilbud.csv");

        // Robot får alle varer og laver en tilfældig kurv
     Robot robot = new Robot();
     ArrayList<Vare> kurv = new ArrayList<>();
     robot.fyldIKurv(kurv);
        System.out.println(kurv);

       /* Kasseapparat kasse = new Kasseapparat(alle, tilbud);

        kasse.printBon(kurv);*/

    }
}
