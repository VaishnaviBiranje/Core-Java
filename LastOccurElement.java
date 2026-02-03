class LastOccurElement{
    public static int lastOccuren(int arr[],int key,int n){
    if (n < 0) {
            return -1;
    }
    if (key == arr[n]) {
            return n;
    }
    
    return lastOccuren(arr,key,n-1);

    }

    public static void main (String args []){
        int arr[] ={8,3,6,9,5,10,2,5,3};
        int key =5;
        System.out.println(lastOccuren(arr,key,arr.length-1));
    } 
}