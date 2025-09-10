class Student{
  String name;
  int age;
  boolean isFemale;
  String datamatikerTeam;
  
  Student(String n, int a,boolean t, String d){
   name = n;
   age = a;
   isFemale = t;
   datamatikerTeam = d;
  }
  void printStudent(){
    println(name + " " + age + " " + isFemale + " datamatikerTeam");
  }
}
