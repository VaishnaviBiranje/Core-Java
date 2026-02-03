class IsArraaySorted{

   public static boolean isSorted(int arr[],int n){
        if(n==0){
            return true;
        }
        if(arr[n]>arr[n-1]){
            return isSorted(arr,n-1);
        }
        else{
            return false;
        }
         
    }

    public static void main(String args[]){
       // int arr[] ={2,4,8,10};
       int arr[] ={2,4,3,8,10};
        System.out.println(isSorted(arr,arr.length - 1));

    }
}