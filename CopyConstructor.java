class Student{
    String name ;
    int roll;
    int password;
    int mark[];

    Student(Student s1){
        mark = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        this.password = s1.password;
        this.mark = s1.mark;
    }
    Student(String name,int roll){
        this.name = name;
        this.roll = roll;
    }
}

class CopyConstructor{

    public static void main(String args[]){
        Student s1 = new Student("vaishnavi",21);
        Student s2 = new Student(s1);
        System.out.println(s2.name);
        System.out.println(s2.roll);

    }

}


