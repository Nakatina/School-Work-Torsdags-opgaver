public class Customer {
    //1.a
    private String firstName;
    private String lastName;
    private String userName;
    private int id;
    private static int counter = 0;

    //1.b + c
    public Customer(String firstName, String userName){
        this.firstName = firstName;
        this.userName = userName;
        counter++; //tæller op
        this.id = counter; //tildeler id
    }
    //1.d laver en override og får en toString der er lidt lækker at se på
    @Override
    public String toString(){
        return "Customer ID: " + id + "\n"
                + "Name: " + firstName + "\n"
                +"Username: " + userName + "\n";
    }

    //prøver at lave getters
    public String getFirstName(){
        return firstName;
    }
    public String getUserName(){
        return userName;
    }
    public int getId(){
        return id;
    }
    //laver nogle simple setters
    public void setFirstName(){
        if(firstName != null && !firstName.equals("") && firstName.length() >1){

        this.firstName = firstName;
    }
    }
    public void setUserName(){
        this.userName = userName;
    }

}
