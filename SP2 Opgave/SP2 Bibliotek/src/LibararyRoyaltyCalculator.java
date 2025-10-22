
public class LibararyRoyaltyCalculator {
    public static void main(String[] args) {
        //eksemplet i opgaven var med en Olga, Men jeg vælger Tolkien
        Author JRR = new Author("John Ronald Reuel Tolkien");

        //1. Printet bog: Ringenes herre
        PrintedBook pb1 = new PrintedBook("Ringenes Herre - Eventyret om Ringen","SKØN",275000,656);

        //lydbogen
        AudioBook ab1 = new AudioBook("Ringenes Herre - Eventyret om Ringen","SKØN",164000,1267);

//ved godt at JRR's bog Tree and leaf Ikkek er Fagliteratur, Men for at teste har jeg sat den som det.
        PrintedBook pb2 = new PrintedBook("Tree and Leaf","FAG",200000,192);
//tildeler jeg bøgerne til Forfatteren.
        JRR.addTitle(pb1);
        JRR.addTitle(pb2);
        JRR.addTitle(ab1);

        double royalty = JRR.calculateRoyalties();
        System.out.println("Forfatter: " + JRR.getName());
        System.out.printf("Samlede bibliotekspenge: %.2f kr" , royalty);


        //Stødte ind i et problem  med toyalty den printede: Samlede bibliotekkspenge: 3.525334229E7 kr.
        //mulig for for store tal?
        //Kojo Hjalp med at vise sin måde at gøre det på ved printf


    }
}