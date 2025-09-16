//her er 4.b og 4h. laver global circle array til 10 cirkler.
Circle[] circles = new Circle[10];
//4.a laver set up
void setup (){
  size (800,600);
  
  //4.i +j Giver os ti objecter i set up med unikke positioner!
  for (int i = 0; i < circles.length; i++){
    float x = 50 + i * 70;
    float y = 300 + sin(i)*50;
    circles[i] = new Circle(x, y );
  }
  
  circles[0] = new Circle(100,100); //en test cirkel
}

Square square = new Square(100, 100);

//4g tester display i draw
void draw(){
  background (255);//hvid baggrund
  if (circles[0] !=null){
    circles[0].display(); //ja fedt vi kan se en statisk fucking cirkle?
  }
  
  for (Circle c : circles){
    c.move(0.5, 0);
  }
  square.move(0.2, 0.1);
}
