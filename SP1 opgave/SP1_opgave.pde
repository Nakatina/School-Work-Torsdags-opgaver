

void setup () {

size(1300,600);


}

void draw(){
 background(42,41,126);
 //Group A
  costumRect(20, 20, color(114,201,222), "russisk flag til test.png", "RUSSIA");
  costumRect(20, 80, color(114,201,222),"saudi.png", "SAUDI ARABIA");
  costumRect(20, 140, color(114,201,222),"Egypt.png", "EGYPT");
  costumRect(20, 200, color(114,201,222),"Uruguay.png", "URUGUAY");
  // Group B 
  costumRect(20, 300, color(249,252,61), "Portugal.png", "PORTUGAL");
  costumRect(20, 360, color(249,252,61),"SPAIN.png", "SPAIN");
  costumRect(20, 420, color(249,252,61),"Morocco.png", "MOROCCO");
  costumRect(20, 480, color(249,252,61),"Iran.png", "IRAN");
  
  //Group C
  costumRect(640, 20, color(114,201,222), "France.png", "FRANCE");
  costumRect(640, 80, color(114,201,222),"Australia.png", "AUSTRALIA");
  costumRect(640, 140, color(114,201,222),"Peru.png", "PERU");
  costumRect(640, 200, color(114,201,222),"Denmark.png", "DENMARK");
  //Group D
  costumRect(640, 300, color(249,252,61), "Argentina.png", "ARGENTINA");
  costumRect(640, 360, color(249,252,61),"Iceland.png", "ICELAND");
  costumRect(640, 420, color(249,252,61),"Croatia.png", "CROATIA");
  costumRect(640, 480, color(249,252,61),"Nigeria.png", "NIGERIA");
}

void costumRect(int x, int y, color barColour, String imgurl, String countryName){
  fill(255);
  rect(x, y, 600, 50);
  fill(barColour);
  rect(x+585, y, 15, 50);
  tint(0, 25);
  PImage img = loadImage(imgurl);
  image(img, x+5, y, 100, 50);
  noTint();
  image(img, x, y, 100, 50);
  fill(20,20,20);
  textSize(45);
  text(countryName, x+130, y+40);
}
