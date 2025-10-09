package Opgave4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileIo {
    public String laesFilIndhold(String filnavn) throws FileNotFoundException{ //her kaster vi fejl vi får til Main?
        File fil = new File(filnavn);
        Scanner filScanner = new Scanner(fil);

        //bruger SB da det er lidt mere effiktivt end at skrive:
        // indhold += filScanner.nextLine() + "\n";

        StringBuilder indhold = new StringBuilder();
        while (filScanner.hasNextLine()){
            indhold.append(filScanner.nextLine()).append("\n");
        }
        filScanner.close();
        return indhold.toString();


    }
}
