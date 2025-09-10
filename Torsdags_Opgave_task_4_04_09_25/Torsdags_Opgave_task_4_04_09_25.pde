//task 4.a


void setup(){
  for (int i = 0; i<=20; i++){
  println(i);
  }
  
  //task 4b
  
  for (int u = 0; u <=20; u+=2){
    println(u);
  }
  
  
  
  //4.c 4.d sammen lagt 
  int start = 5;
  for (int c = start; c>=0; c--){
    if (c == 3){
      println("Three");
    }else if (c == 2){
      println("Two");
    }else if (c == 1){
      println("One");
    }else if (c == 0){
      println("Lift off!");
    } else {
      println(c);
    }
  }
  }
