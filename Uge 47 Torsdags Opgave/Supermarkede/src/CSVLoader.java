import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class CSVLoader {

    public static Map<String, Vare> load(String filename) {
        Map<String, Vare> varer = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {

            String line = br.readLine(); // første linje = header → spring over

            while ((line = br.readLine()) != null) {
                String[] cols = line.split(";"); // eller "," afhængigt af filen

                // Hent værdierne
                // id;name;priceDate;price;isBudgetBrand;quantity;unit;isWeighted;isBio;isAvailable
                String ean = cols[0];
                String navn = cols[1];
                LocalDate dato = LocalDate.parse(cols[2]);
                double pris = Double.parseDouble(cols[3]);

                double maengde = Double.parseDouble(cols[5]);
                String enhed = cols[6];

                // Lav vare-objektet
                Vare v = new Vare(ean, navn, dato, pris, maengde, enhed);

                // Læg i map
                varer.put(ean, v);
            }

        } catch (IOException e) {
            System.out.println("FEJL ved indlæsning af CSV: " + filename);
            e.printStackTrace();
        }

        return varer;
    }
}
