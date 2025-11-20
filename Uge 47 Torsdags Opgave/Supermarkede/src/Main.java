import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;


public class Main {
    public static void main(String[] args) {
        Map<String, Vare> alleVarer = CSVLoader.load("data/varer.csv");
        Map<String, Vare> tilbud = CSVLoader.load("data/tilbud.csv");

        System.out.println("Antall varer indlæst: " + alleVarer.size());
        System.out.println("Antal tilbud indlæst: " + tilbud.size());
        System.out.println();

        // Robot får alle varer og laver en tilfældig kurv
        Robot robot = new Robot();

        Collection<Vare> kurv = robot.fyldIKurv(alleVarer.values());

        System.out.println("Robot lavede kurv med " + kurv.size() + " varer.");
        System.out.println();

       Kasseapparat kasse = new Kasseapparat(alleVarer, tilbud);

        kasse.printBon(kurv);

    }
}
