//Task 1
void setup(){
  //1.b
  sayHello();
  //1.c
  printMessage("Hulla hopsa parameter!");
  //1.d
  printNameAndAge("Mulan", 18);
}
void sayHello(){
 println("Her siger metoden Hejsa!");  
}
void printMessage(String message){
  println(message);
}
void printNameAndAge(String name, int age){
 println("Mit navn er " + name + ", jeg er " + age + " år gammel");
}
