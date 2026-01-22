import java.util.Scanner;
class OddEvenNo{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number:");
        int number = sc.nextInt();
        if(number%2 == 0){
            System.out.println("this even number...");
        }
        else{
            System.out.println("this odd number..");
        }

    }
}