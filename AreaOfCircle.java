import java.util.Scanner;
class AreaOfCircle{
    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Radius Of Circle: ");
        float pi = 3.14f;
        float r =sc.nextInt();
        double area = pi * r * r;
        System.out.println("Area of Circle is " + area);
    }
}