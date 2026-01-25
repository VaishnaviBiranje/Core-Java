class KadanesMaxSubASum{
    public static void kadanes(int arr[]){
        int currentSum =0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){

            currentSum += arr[i];
            
            if(currentSum< 0){
                currentSum = 0;
            }
            
            if(currentSum>maxSum){
                maxSum = currentSum;
            }
        }
        System.out.print(" maximum subarray sum is "+maxSum);
    }

    public static void main(String args[]){
        int arr[] = {1,-2,6,-1,3};
        kadanes(arr);
        
    }
}