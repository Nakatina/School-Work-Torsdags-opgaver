
//4.c og 4.d circle class med xpos og ypos og en lille cheeky cconstructor!
class Circle{
  float xposition;
  float yposition;
  
  Circle(float x, float y){ //hej jeg er konstruktøren!
    xposition = x;
    yposition = y;
  }
  
  //4.f
  void display(){
    fill(0,100,255); //blå farve
    ellipse(xposition, yposition, 30, 30);
  }
  //4.k giver movement til cirklen i vores klasse
  void move(float dx, float dy){
    xposition += dx;
    yposition += dy;
    display();
  }
}
