boolean happy = true;

 void setup() {
   if (iAmHappy())
   {
     println("I clap my hands");
   }
   else
   {
     println("I don't clap my hands"); 
   }
  String ost = upperCase("ostemad");
  println(ost);
boolean isUpperCase = sUpperCase("Hello");
boolean isUpperCase1 = sUpperCase("hello");
println(isUpperCase);
println(isUpperCase1);
}


boolean iAmHappy(){
  // fill out what is missing here: 
  return happy;
}
int add(int a, int b){
  return a + b;
}
String upperCase(String u){
 return u.toUpperCase();
 
}
boolean sUpperCase(String s){
  return Character.isUpperCase(s.charAt(0));
  
}
