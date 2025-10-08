package Opgave2;
import java.util.Scanner;

public class TalFraBruger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fødselsår =0; //Første jeg gør er at lave en Int med sat fødsels år til 0
        boolean gyldigtInput = false; //Bruger boolean til at komme ud af det whiel loop jeg skriver

        while (!gyldigtInput){//laver while look hvor jeg sætter i min Try inputtet til True så vi kan komme ud af loopet.
            System.out.println("Indtast dit fødselsår:");
            String input = scanner.nextLine();

            try{
                fødselsår = Integer.parseInt(input); //her vil vi gerne bare have hele tal og ikke "ABC"
                gyldigtInput = true;
            } catch (NumberFormatException e) { //Hvis brugeren skriver "ABC" eller sådan så printer vi fejl Det skal være hel tal.
                System.out.println("Fejl: Du skal alså intaste et gyldigt tal fx. 1995");
            }
        }

        int nuværendeÅr = 2025;
        int alder = nuværendeÅr - fødselsår;
        System.out.println("Du er cirka " +alder + " år gammel.");
        scanner.close();




        // Brug Integer.parseInt til at konvertere input til int
        // Beregn brugerens alder (antag at nuværende år er 2025)
        // Print alderen
    }
}
