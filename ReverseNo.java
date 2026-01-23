import java.util.Scanner;
class ReverseNo{
    public static void main(String args[]){
        int n= 10899;
        System.out.println(132/10);
        System.out.println(132%10);

        //way 1
        // String last ="";
        // while(n>0){
        //     last += n%10;
        //     n = n/10;
        // }
        // System.out.println(last);


        //way2
        int ReverseN=0;
        while(n>0){
            int last = n%10;
            ReverseN = (ReverseN*10)+ last;
            n = n/10;
        }
        System.out.println(ReverseN);


         
    }
}