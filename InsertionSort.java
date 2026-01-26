// pick element (from unsorted part) and place in right
//position in sorted part

class InsertionSort{

    // public static void sort(int arr[]){
    //     for(int i=1;i<arr.length;i++){
    //         int current = arr[i];
    //         int pev = i-1;
    //         while(pev>=0 && arr[pev]>current){
    //             arr[pev+1] = arr[pev];  
    //             pev--;  
    //         }
    //         arr[pev+1] = current;
    //     }

    // }


    public static void sort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int current = arr[i];
            int prev = i-1;
            while(prev>=0 && current < arr[prev]){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = current;

        }
    }


public static void main(String args[]){

    int arr[] = {5,4,1,3,2};
        for(int i=0 ;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        sort(arr);
        System.out.println();

        for(int i=0 ;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
}
}