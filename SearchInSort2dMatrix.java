class SearchInSort2dMatrix{


    public static boolean search(int arr[][],int key){
        int n= 0;
        int m = arr[0].length-1;
        while(n<=arr.length-1 && m>=0 ){
            if(arr[n][m]==key){
                System.out.print("key is found at index ("+n+","+m+")");
                return true;
            }
            else if(key>arr[n][m]){
                n++;
            }
            else{
                m--;
            }
        }
        System.out.print("key is not found  ");
        return false;
    }

    public static void main(String args[]){
        int matrix[][] ={{10,20,30,40},
                          {15,25,35,45},
                          {27,29,37,48},
                          {32,33,39,50}
        };
        search(matrix,29);
    }
}