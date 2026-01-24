 
import java.util.Scanner;

class PrimeRange{
public static boolean isprime(int n){
    if(n==2){
        return true;
    }
    for(int i = 2;i<=Math.sqrt(n);i++){
        if(n%i==0){
            return false;
        }
    }
    return true;
}


    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the range of number:");
    int source = sc.nextInt();
    int des = sc.nextInt();

    for(int i=source;i<=des;i++){
        if(isprime(i)== true){
            System.out.print(i +" ");
        }

    }
    }

}