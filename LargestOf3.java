import java.util.Scanner;
class LargestOf3{
public static void main(String args[])
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Pleas Enter 3 number");
    int a =sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    if(a>b && a>c){
        System.out.println(a+ " is grater number.");
    }
    else if(b>c){
        System.out.println(b+ " is grater number.");
    }
    else{
        System.out.println(c+ " is grater number.");
    }

}
} 