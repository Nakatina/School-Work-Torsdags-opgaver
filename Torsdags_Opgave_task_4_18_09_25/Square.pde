class Square{
  float x, y;
  
  Square(float x, float y){
    this.x = x;
    this.y = y;
  }
  void display(){
    fill (255,100,0);
    rect(x,y, 30, 30);
  }
  void move(float dx, float dy){
    x += dx;
    y+= dy;
    display();
  }
}
