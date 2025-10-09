package Opgave4;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class FilLaeserProgram {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        FileIo fileIo = new FileIo();

        boolean filFundet = false;
        String indhold = "";

        while(!filFundet){
            System.out.println("Indtast filnavnet her: ");
            String filNavn = scanner.nextLine();

            try{
                indhold = fileIo.laesFilIndhold(filNavn);
                filFundet = true;
            }catch (FileNotFoundException e){
                System.out.println("Fejl: Filen '" + filNavn + "' bllev ikke fundet. prøv igen!");
            }
        }

        System.out.println("\nIndholdet af filen:");
        System.out.println(indhold);
    }
}
