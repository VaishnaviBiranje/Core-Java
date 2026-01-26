// largest element come to end of array
// by swapping with adjecent element

class BubbleSort{
    public static void sort(int arr[]){

        int temp;
       

        for(int i=0 ;i<arr.length-1;i++){
            boolean swap=false;
            for(int j=0;j<arr.length-i-1;j++ ){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                }
            }
            if(swap== false){
                break;
            }
        }

    }
    public static void main(String args[]){
        int arr[] = {5,4,1,3,2};
        for(int i=0 ;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        sort(arr);

        for(int i=0 ;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
