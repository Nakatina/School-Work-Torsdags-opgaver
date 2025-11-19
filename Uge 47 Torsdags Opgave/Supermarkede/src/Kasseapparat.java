import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Kasseapparat {
    private Map<String, Vare> alleVarer;
    private Map<String, Vare> tilbudsVarer;

    public Kasseapparat(Map<String, Vare> alleVarer, Map<String, Vare> tilbudsVarer) {
        this.alleVarer = alleVarer;
        this.tilbudsVarer = tilbudsVarer;
    }

    public void printBon(Collection<Vare> kurv) {


            Map<String, Integer> tæller = new HashMap<>();

            // Gruppér varerne
            for (Vare v : kurv) {
                tæller.merge(v.getEan(), 1, Integer::sum);
            }

            double total = 0;

            System.out.println("----------------------------------");

            // For hver varelinje i tælleren
            for (String ean : tæller.keySet()) {

                int antal = tæller.get(ean);
                Vare normal = alleVarer.get(ean);
                Vare tilbud = tilbudsVarer.get(ean);

                double pris = (tilbud != null) ? tilbud.getPris() : normal.getPris();
                double linjeTotal = antal * pris;

                //System.out.println(normal tilbud);

                total += linjeTotal;
            }

            // Momsberegning (25 % i Danmark)
            double moms = total * 0.20; // hvis total er INKL moms
            // Hvis total er EKSKL moms → brug 0.25 men det giver sig selv

            System.out.println("----------------------------------");
            System.out.printf("TOTAL: %.2f\n", total);
            System.out.printf("MOMS:  %.2f\n", moms);
            System.out.println("----------------------------------");
            System.out.println("Tak for dit køb!");

    }
    private void printLinje(Vare normal, Vare tilbud, int antal) {

        System.out.println(normal.getNavn());

        double normalPris = normal.getPris();
        double tilbudPris = (tilbud != null ? tilbud.getPris() : normalPris);

        double linjeTotal = antal * tilbudPris;

        System.out.printf("%d x %.2f = %.2f\n", antal, tilbudPris, linjeTotal);

        if (tilbud != null) {
            double normalTotal = antal * normalPris;
            double rabat = normalTotal - linjeTotal;

            System.out.printf("Normalpris: %.2f\n", normalTotal);
            System.out.printf("Rabat: -%.2f\n", rabat);
        }

        System.out.println();
    }
}
