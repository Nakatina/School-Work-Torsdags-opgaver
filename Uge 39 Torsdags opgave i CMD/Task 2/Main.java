import java.util.Scanner; //Her henter vi lige scanneren!

public class Main{

	public static void main(String[] args){
	//2.b promt for navn
		System.out.println("Vær så vennelig at skriv dit navn");
		Scanner scanner = new Scanner(System.in); //her er scanneren lavet
	// 2.d læser input
		String name = scanner.nextLine();

		System.out.println("Goddav " + name + ", hvor gammel er du?");

		int age = scanner.nextInt();

		System.out.println("Er du virkelig " + age + " år gammel?");

		int yearsToRetirement = 67 - age;

		if (yearsToRetirement > 0){
			System.out.println("Du har " + yearsToRetirement + " år til du skal på pension");
			} else{
				System.out.println("Gå på Pension for den da!");
			}
	scanner.close(); //altid en godide at lukke for din scanner :D
		}

}