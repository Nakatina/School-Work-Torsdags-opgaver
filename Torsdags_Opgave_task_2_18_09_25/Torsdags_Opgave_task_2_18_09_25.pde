void setup() {
  // test 2.b
  //vi tester med københavn med 0, 3 og vorventer den udskriver "Køb"
  printPartOfWord("københavn", 0, 3);
  
//for de fire sidste bruger vi substring(word.length() -4,wordlength())

  printPartOfWord("København", "København".length() - 4, "københavn".length());
  
  // Test 2.e – negative værdier
  //Her chekker vi om 
  printPartOfWord("København", -2, 3); // fejl

  // Test 2.e – start > slut
  printPartOfWord("København", 5, 2); // fejl

  // Test 2.e – slut > længde
  printPartOfWord("København", 3, 100); // fejl
}

//2.a Metode med fejltjeck
//vi laver metoden som bruger substring() og skriver result ud!
void printPartOfWord(String word, int start, int end) {
  if (word == null) {
    println ("Vi har fejl! Ordet er null!");
    return;
  }
  if (start < 0 || end >word.length()) {
    println("Fejl! Start eller slut er udenfor ordest grænse!");
    return;
  }
if (start >= end){
  println("Fejl igen! start indekset skal være mindre end slut indekset");
  return;
}
String result = word.substring(start, end);
println("Udsnit: " + result);
}
