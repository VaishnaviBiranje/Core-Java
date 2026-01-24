import java.util.Scanner;
class BinaryToDecimal{
    
    public static int binToDec(int binNum){
        int power =0;
        int decimal = 0;
        int lastD;
        while(binNum>0){
            lastD = binNum % 10;
            decimal += (lastD*(int)(Math.pow(2,power)));
            power++;
            binNum /=10;
        }
        return decimal;
    }


    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    
    System.out.print("enter the binary number:");
    int binary= sc.nextInt();
    System.out.print(binToDec(binary));

    
    }
}