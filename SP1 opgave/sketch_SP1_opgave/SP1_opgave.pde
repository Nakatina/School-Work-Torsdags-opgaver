Group[] groups = {
    new Group(0, 20, "GROUP A",color(114, 201, 222),
    new Country[]{
      new Country("russisk flag til test.png", "RUSSIA"),
      new Country("saudi.png", "SAUDI ARABIA" ),
      new Country("Egypt.png", "EGYPT"),
      new Country("Uruguay.png", "URUGUAY")
    }),
    new Group(0, 340, "GROUP B",color(249,252,61),
    new Country[]{
      new Country("Portugal.png", "PORTUGAL"),
      new Country("SPAIN.png", "SPAIN"),
      new Country("Morocco.png", "MOROCCO"),
      new Country("Iran.png", "IRAN")
    }),
    new Group(615, 20, "GROUP C", color(114,201,222),
    new Country[]{
        new Country("France.png", "FRANCE"),
        new Country("Australia.png", "AUSTRALIA"),
        new Country("Peru.png", "PERU"),
        new Country("Denmark.png", "DENMARK")
    }),
    new Group(615, 340, "GROUP D", color(249,252,61),
    new Country[]{
      new Country("Argentina.png", "ARGENTINA"),
      new Country("Iceland.png", "ICELAND"),
      new Country("Croatia.png", "CROATIA"),
      new Country("Nigeria.png", "NIGERIA")
    })
    };

void setup () {
  


    size(1220, 615);
}


void draw() {
  background(42, 41, 126);
  fill(255);
  rect(605,0, 5, 650);
  
  
 for(Group g: groups){
   fill(g.barColour);
   textSize(28);
   text(g.name, g.startX + 220, g.startY + 30);
   for(int i = 0; i < g.countries.length; i++){
   int y = g.startY + 40 + i * 60;
   costumRect(g.startX, y, g.barColour, g.countries[i].flag, g.countries[i].name);
   
   }
     
 }


}



void costumRect(int x, int y, color barColour, String imgurl, String countryName) {
  fill(255);
  rect(x, y, 600, 50);
  fill(barColour);
  rect(x+585, y, 15, 50);
  tint(0, 25);
  PImage img = loadImage(imgurl);
  image(img, x+5, y, 100, 50);
  noTint();
  image(img, x, y, 100, 50);
  fill(20, 20, 20);
  textSize(45);
  text(countryName, x+130, y+40);
}
