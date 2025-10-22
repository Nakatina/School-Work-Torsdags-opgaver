//igen endnu en subklasse til Title
public class AudioBook extends Title{
    private int durationInMinutes;
    private int copies;

    public AudioBook(String title, String literaturType, int copies, int durationInMinutes){
        super(title, literaturType);
        this.copies = copies;
        this.durationInMinutes =durationInMinutes;
    }

    @Override
    public double calculatePoints(){
        return(durationInMinutes * 0.5) * convertLiteratureType() * copies;
    }
}
