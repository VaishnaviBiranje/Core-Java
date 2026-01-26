//import java.util.Arrays;
import java.util.*;
class InbuildSort{


    public static void main(String args[]){
        int arr[] = {5,4,1,3,2,12,6};
        for(int i=0 ;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        Arrays.sort(arr);        //O(nlogn) <----inbuild function
        

        for(int i=0 ;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        //Arrays.sort(arr,0,4);     // specific index sort only
        System.out.println();    //Arrays.sort(array,si,ei)




        //Reverse
        Integer num[] = {3,7,9,1,4,12};
        Arrays.sort(num,Collections.reverseOrder());
        //Arrays.sort(num,0,3,Collections.reverseOrder());
        for(Integer i=0 ;i<num.length;i++){
          //  System.out.print(arr[i]+" ");
              System.out.print(num[i]+" ");
        }
    }
}