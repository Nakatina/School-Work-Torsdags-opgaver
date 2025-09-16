int[] arr = {28, 230, 9, 310, 72};
//1.a det globale array

void setup(){
  // 1.c kalder vi getRandom() i setupen
 int randomElement = getRandom();
  println("Random element from array: " + randomElement);
}
//1.b Metoden der retunerer et random element
int getRandom(){
  int index = int(random(arr.length)); //random() retunerer en float, som der bliver lavet til int.
  return arr[index];
}
