import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Vare {
    private String ean;
    private String navn;
    private LocalDate prisAendringData;
    private double pris;
    private double maengde;
    private String enhed;


    public Vare(String ean, String navn, LocalDate prisAendringData, double pris, double maengde, String enhed) {
        this.ean = ean;
        this.navn = navn;
        this.prisAendringData = prisAendringData;
        this.pris = pris;
        this.maengde = maengde;
        this.enhed = enhed;
    }

    Map<String, Vare> alleVarer = new HashMap<>();
    Map<String, Vare> tilbudsVarer = new HashMap<>();






    public String getEan() {
        return ean;
    }

    public String getNavn() {
        return navn;
    }

    public LocalDate getPrisAendringData() {
        return prisAendringData;
    }

    public double getPris() {
        return pris;
    }

    public double getMaengde() {
        return maengde;
    }

    public String getEnhed() {
        return enhed;
    }
}
