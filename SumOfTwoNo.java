import java.util.Scanner;
class SumOfTwoNo{
    public static void main(String args[]){
        int a = 12;
        int b = 10;
        int sum = a+b;
        System.out.println("Sum is "+sum);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 2 numbers:");
        int a1 = sc.nextInt();
        int b2 = sc.nextInt();
        System.out.println("Sum is: "+ (a1+b2));

    }
}