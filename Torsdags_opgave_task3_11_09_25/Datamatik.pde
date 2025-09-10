// teacher;
//Student student;
void setup(){

 Teacher teacher = new Teacher("Tine", 67,true);
 Student student = new Student("Sebastian", 30, false, "1");
 Student student1 = new Student("Peter", 33, false, "1");
 teacher.printTeacher();
 student.printStudent();
 student1.printStudent();
}
