import java.util.Scanner;
class DecimalToBinary{
    public static int decToBin(int decimal){
        int rem;
        int qust= decimal;
        int power = 0;
        int binaryN =0;
        while(qust>0){
            rem =qust%2;
            binaryN = binaryN + (rem * (int)Math.pow(10,power));
            qust = qust/2;
            power++;

        }
        return binaryN;

    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int decimal= sc.nextInt();
        System.out.print("binary of "+ decimal+" is "+ decToBin(decimal));

    }
}