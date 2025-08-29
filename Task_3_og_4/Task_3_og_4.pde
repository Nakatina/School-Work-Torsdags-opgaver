//Task 3
String address; //3.b
int x=1;
int y=2;
int legSammen = x + y; //3.c
float divide = 100/4;
String msg = "Du har glemt mig";

// task 4 
void setup(){
 x= 3;
  y=4;
  address ="ostevej 75 22500"; 
  println("Adresse"+" "+address);//4c
   println(x+y);
   println (msg);
   msg += "igen"; //4.e tildelt ny værdi til variable, men som tilføjelse
println(msg);
x++;
y++; //4f
println(x, y);
x += 3;
y += 3;
println(x, y);
x --;
y--;
println(x,y); //task 4 all done.
}
