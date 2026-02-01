class College{
    static String collegeName;
    
    String studentName;

}

class Statickeyword{
    public static void main(String args[]){
    College c1 = new College();
    c1.collegeName = "D Y Patil College";
    College c2 = new  College();
    System.out.println(c2.collegeName);

    }
}