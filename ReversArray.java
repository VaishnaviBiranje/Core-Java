class ReversArray{

    public static void reverse(int arr[]){
        int temp;
        int n = arr.length;
        for(int i=0;i<n/2;i++){
            temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
        }
    }

    public static void main(String args[]){
        int arr[] = {2,4,6,8,10};
        for(int i= 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        reverse(arr);
        System.out.println();
        for(int i= 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }


    }
}