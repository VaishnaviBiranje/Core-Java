class Student{
String name ;
int roll;

Student(){
    System.out.print("Constructor is calling ...");
}

Student(String name,int roll){
    System.out.print("Constructor is calling ...");
    this.name = name;
    this.roll = roll;

}
}

class Construct{
      public static void main(String args[]){
      Student s1 = new Student("vaishnavi",21);
      System.out.println(s1.name);
      System.out.println(s1.roll);

      Student n1 = new Student();
      
      } 
}