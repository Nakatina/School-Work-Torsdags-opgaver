class Teacher{
  String name;
  int age;
  boolean isFemale;
  
  Teacher(String n, int a,boolean t){
   name = n;
   age = a;
   isFemale = t;
   }
   void printTeacher(){
    println(name + " " + age + " " + isFemale);
   }
   void changeName(String n){
     name = n;
     println(" " + age + " " + isFemale);
   }
}
