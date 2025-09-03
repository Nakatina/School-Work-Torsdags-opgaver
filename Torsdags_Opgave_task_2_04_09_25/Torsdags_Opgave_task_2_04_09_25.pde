String name = "Sebastian";
int age = 30;
boolean mood = true;

void setup (){
  //printer det ud vi kender nemt og simpelt
  println("Hej mit navn er " + name + ".");
  println("I am " + age + " years old");
  
  //da det skal være don't bruger jeg !mood som er det samme som mood == false
   if (!mood){
     println("I don't clap my hands");
   } else{
     println("I clap my hands");
   }

}
