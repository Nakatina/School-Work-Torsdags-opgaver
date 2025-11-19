import java.util.Collection;
import java.util.Map;

public class Kasseapparat {
    private Map<String, Vare> alleVarer;
    private Map<String, Vare> tilbudsVarer;

    public Kasseapparat(Map<String, Vare> alleVarer, Map<String, Vare> tilbudsVarer) {
        this.alleVarer = alleVarer;
        this.tilbudsVarer = tilbudsVarer;
    }

    public void printBon(Collection<Vare> kurv) {
        Vare normal = alleVarer.get(ean);
        Vare tilbud = tilbudsVarer.get(ean);

        double pris = (tilbud != null) ? tilbud.getPris() : normal.getPris();

    }
}
