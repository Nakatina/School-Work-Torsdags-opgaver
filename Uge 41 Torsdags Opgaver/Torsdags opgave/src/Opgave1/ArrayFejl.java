package Opgave1;

public class ArrayFejl {

    //Koden med Fejl her Fejlen Jeg får: java: class, interface, enum, or record expected (adendum: Fejl Løst Via Discord snak med Lære)
    public static void printTreForsteElementer(String[] array) {
        //Jeg prøver at implementere en Try Catch da jeg kan se at navne2 vil skabe en ArrayindexOutOfBounceException, Da i det array er der kun 2 navne ergo index 0 og 1, ingen 2.
        try {
            System.out.println("Første element: " + array[0]);
            System.out.println("Andet element: " + array[1]);
            System.out.println("Tredje element: " + array[2]);

        }catch (ArrayIndexOutOfBoundsException e){
        System.out.println("fejl: array indeholder ikke nok elementer til at udskrive tre.");
        }
    }
}
