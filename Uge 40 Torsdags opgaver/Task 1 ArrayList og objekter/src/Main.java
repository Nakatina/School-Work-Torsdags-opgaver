import java.util.ArrayList;
//1.e
public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();

        //til føjer kunder til listen
        customers.add(new Customer("Sebastian", "KodeMaskine"));
        customers.add(new Customer("Signe", "LæreOverhoved"));
        customers.add(new Customer("Christian","Bullerfnis"));

        //kalder på printCustomers
        printCustomers(customers);


    }
    //1.f laver en print metode
    public static void printCustomers(ArrayList<Customer> customers){
        for (Customer customer : customers){
            System.out.println(customer);
        }
    }
}