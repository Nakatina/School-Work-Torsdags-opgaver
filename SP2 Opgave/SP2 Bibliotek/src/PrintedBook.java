//laver en sub klasse til Titles,
public class PrintedBook extends Title{
    private int pages;
    private int copies;

    public PrintedBook(String title, String literaturType, int copies, int pages){
        super(title,literaturType);
        this.copies = copies;
        this.pages = pages;
    }

    @Override
    public double calculatePoints(){
        return pages * convertLiteratureType() * copies;
    }
}
