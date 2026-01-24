class BinarySearch{
   public static int binaryS(int arr[],int key){

    int left = 0;
    int right  = arr.length-1;
    int mid;
    while(left<=right){
        mid = (left + right)/2;
        if(arr[mid] == key){
            return mid;
        }
        else if(arr[mid]>key){
            right = mid -1;
        }
        else{
            left = mid + 1;
        }
    }
        return -1;
   }

   public static void main(String args[]){
    int arr[] = {2,4,6,8,10,12,14};
    int index = binaryS(arr,14);
    if(index == -1){
        System.out.println("key is not found");
    }
    else{
        System.out.println("key is found at index "+index);
    }

   }
}