import java.util.*;
class LargestNoInArray{

    public static int largest(int arr[]){
        int largeNo = Integer.MIN_VALUE;
        int minNo = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(largeNo<arr[i]){
                largeNo = arr[i];
            }
            if(minNo>arr[i]){
                minNo = arr[i];
            }
        }
        System.out.println("smallest value is "+minNo);
        return largeNo;

    }
    public static void main(String args []){
        int arr[] = {1,2,6,3,5};
        int largeNo = largest(arr);
        System.out.println("This is largest value in array "+largeNo);

    }
}