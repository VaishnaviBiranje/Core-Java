class TypePrmotion{

    public static void main(String arg[]){

     // Case 1:  
     char a = 'a';
     char b = 'b';
     System.out.println(b-a); 
     //when expression comes it oprand automatically promt in int 

     char a1 = 'a';
     byte b1 = 5;
     short c1 = 2;
     System.out.println("Type Prmotion "+(a1+b1+c1));
     //in expression char,byte short convert into int and give output as int

     // Case 2
     int aa = 10;
     float bb = 20.5f;
     long  cc = 45;
     double dd = 55;
     System.out.println((aa + bb + cc + dd));
     // convert each data type to double  and return double as output 
     //it alwyas prmot to bigger data type

    }
}