import java.util.Scanner;
class IncomTaxCalc{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Your Income");
        int Income = sc.nextInt();
        int tax = 0;
        
        if(Income<500000){
            System.out.println("tax is "+ tax);
        }
        else if((Income>=500000)&&(Income<=1000000)){
            tax = (int)(Income * 0.2);
         System.out.println("your tax is "+ tax);   
        }
        else{
         tax = (int)(Income * 0.3);
         System.out.println("your tax is "+ tax);

        }
    }
}