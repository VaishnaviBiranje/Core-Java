//find maximum number from array
//create array that maximum size array
//count the frequancy of each number at there in particular index
//aply loop and index number put on actual array and decreas frequancy until zero.
 

class CountingSort{


    public static void sort(int arr[]){
        int max = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            max = Math.max(max,arr[i]);
        }
        int count[] = new int[max+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int j=0;
        for(int i =0 ;i<count.length;i++){
            while(count[i]>0){
                arr[j] = i;
                count[i]--;
                j++;
            }
        }

    }


    public static void main(String args[]){
        int arr[] ={1,4,1,3,2,4,3,7};
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