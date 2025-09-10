//opgave 3.a sat værdier til 5 i a og b og lavet en sammenlagt sum af de to
int a = 5;
int b = 5 ;
int sum = a + b;
// her siger jeg at hvis a er det samme som 10 og b det samme som 10
//opg 3.b sat værdier af min og max og sumA 
int min = 3;
int max = 8;
int sumA = min + max;

//3.c
int x = 9;
int y = 11;
int z = 10;
int sumB = x + y + z;
void setup(){
if (a == 10 || b == 10 || sum == 10){
  println ("Sucess!");
}else{ 
    println("Failure!");
}
//3.b
if (sumA > 10 && (min <= 5 || max <=5)){
  println("Success2!");
} else {
  println("Failure2!");
}
// sumA >10 summen af min og max skal være større end 10
// mindst en af værdierne i min max skal være mindre eller lig med 5

// 3.c lav 3 integer variable kaldet x, y and z. Print "Success!" hvis følgende betingelse er opfyldt: summen af dem er 30, men ingen af dem har værdien 10, 20 eller 30. Ellers print "Failure!".
if (sum == 30 && x != 10 && x !=20 && x !=30 && y != 10 && y !=20 && y !=30 && z != 10 && z !=20 && z !=30){
  println("Success3!");}
  else{
    println("Failure3!");
  }
}
