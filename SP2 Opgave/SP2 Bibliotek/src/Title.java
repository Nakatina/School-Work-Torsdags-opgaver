//her laver jeg den Abstrakte Superklasse
public abstract class Title {
    protected String title;
    protected String literatureType;
    protected static final double RATE = 0.067574;

    public Title(String title, String literatureType){
        this.title = title;
        this.literatureType =literatureType;
    }
    public double calculateRoyalty(){
        return calculatePoints() * RATE;
    }
    public double convertLiteratureType(){
        //laver en switch der kan sorter og giver points efter hvad Type det er
        return switch (literatureType){
            case "BI", "TE" -> 3;
            case "LYRIK" -> 6;
            case "SKØN" -> 1.7;
            case "FAG" -> 1;
            default -> 1;
        };
    }
//her laves den abstracte motode, der skal implementers i subklasserne. også kaldet Polymorfi
    public abstract double calculatePoints();
}
