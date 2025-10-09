package Opgave5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TalFraFil {
    public static void main(String[] args){
        int[] talArray = new int[5];
        int index = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Indtast fillnavn: ");
        String filNavn = scanner.nextLine();

        try{
            File fil = new File(filNavn);
            Scanner filScanner = new Scanner(fil);

            while (filScanner.hasNext()){
                String linje = filScanner.nextLine();
                talArray[index] = Integer.parseInt(linje); //her kan den muligvis kaste Number format excption?
                index++;
            }
            filScanner.close();

            //udskriver vi vores  tal
            System.out.println("Tallene fra filen: ");
            for (int tal : talArray){
                System.out.println(tal);
            }
            //her laver jeg alle mine catches. for at fange de problemer der kan komme.
        } catch (FileNotFoundException e){
            System.out.println("Fejl: Filen '" + filNavn + "'Blev ikke fundet.");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Fejl: Filen indeholder for mange tal. Maksimal tal er 5 forstå det.");
        } catch(NumberFormatException e){
            System.out.println("Fejl: Filen indeholder ugyldigt talformat (Ikke et heltal)");
        }
        scanner.close();

    }
}
