class PrefixMaxSubArraySum2{
    public static void maxSubSum(int arr[]){
        
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        int maxSum = Integer.MIN_VALUE;
        int currSum =0;
        for(int i=1;i<arr.length;i++){
            prefix[i] =prefix[i-1] + arr[i];
        }

        for(int i=0;i<prefix.length;i++){
            for(int j=i;j<prefix.length;j++){
                currSum = i ==0 ? prefix[j] :prefix[j] - prefix[i];

                if(maxSum < currSum){
                    maxSum =currSum ;
                }
                 
            }
        }

        System.out.print("maximum sum is "+ maxSum);

    }

    public static void main(String args[]){
        int arr[] = {1,-2,6,-1,3};
        maxSubSum(arr);
    }
}