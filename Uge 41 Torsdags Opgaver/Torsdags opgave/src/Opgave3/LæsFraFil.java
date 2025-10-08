package Opgave3;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LæsFraFil {
    public static void main(String[] args){
        Scanner inputScanner = new Scanner(System.in);
        Scanner filScanner = null;
        boolean filFundet = false;

        while(!filFundet){
            System.out.println("indtast fil navn her: ");
            String filnavn = inputScanner.nextLine();

            try {
                File fil = new File(filnavn);
                filScanner = new Scanner(fil);
                filFundet = true;

                System.out.println("\nIndholdet af filen '" + filnavn +"':");
                while (filScanner.hasNextLine()){
                    String linje = filScanner.nextLine();
                    System.out.println(linje);
                }
            }catch (FileNotFoundException e){
                System.out.println("Fejl: Filen '"+ filnavn +"' blev ikke fundet. prøv igen!");
            }
        }
        if(filScanner != null){
            filScanner.close();
        }
        inputScanner.close();


    }
}
