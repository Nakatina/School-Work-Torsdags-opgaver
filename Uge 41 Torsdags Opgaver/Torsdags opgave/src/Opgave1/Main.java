package Opgave1;

//importetet static opgave 1 a
import static Opgave1.ArrayFejl.printTreForsteElementer;

public class Main {

    public static void main(String[] args) {
        String[] navne1 = {"Anna", "Bob", "Clara", "David"};
        String[] navne2 = {"Eva", "Frank"};
        //fejlen er tydeligt når man kigger på det, Den ligger i navne2 da Arrayed har kun 2 navne og vi prøver at kalde et extra der ikke er der.
        //Derfor har vi i Fejl

        ArrayFejl.printTreForsteElementer(navne1);
        printTreForsteElementer(navne2);


    }
} //Jeg Kunne nok godt have lavet det her anderledes. Istedet for at Importe, Men jeg tror at der er noget jeg har glemt.
